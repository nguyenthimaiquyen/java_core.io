package day10_OOP.logicHandle;

import day10_OOP.entity.ArticleType;
import day10_OOP.entity.Payroll;
import day10_OOP.entity.PayrollDetail;
import day10_OOP.entity.Reporter;

import java.util.Scanner;

public class PayrollLogicManagement {
    private Payroll[] payrolls = new Payroll[100];
    private ReporterLogicManagement reporterLogicManagement;
    private ArticleTypeLogicManagement articleTypeLogicManagement;

    public PayrollLogicManagement(ReporterLogicManagement reporterLogicManagement, ArticleTypeLogicManagement articleTypeLogicManagement) {
        this.reporterLogicManagement = reporterLogicManagement;
        this.articleTypeLogicManagement = articleTypeLogicManagement;
    }

    public void showPayroll() {
        for (int i = 0; i < payrolls.length; i++) {
            if (payrolls[i] != null) {
                System.out.println(payrolls[i]);
            }
        }
    }

    public void inputNewPayroll() {
        if (!reporterLogicManagement.reporterIsNotEmpty() || !articleTypeLogicManagement.articleTypesIsNotEmpty()) {
            System.out.println("Không có dữ liệu phóng viên hoặc kiểu bài viết, vui lòng tạo đủ dữ liệu trước khi lập bảng tính công!");
            return;
        }

        System.out.print("Nhập số phóng viên bạn muốn tính công: ");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin phóng viên thứ "+ (i+1) + " bạn muốn tính công: ");
            System.out.print("Nhập ID phóng viên: ");
            int reporterID;
            Reporter reporter = null;
            do {
                reporterID = new Scanner(System.in).nextInt();
                for (int j = 0; j < reporterLogicManagement.getReporters().length; j++) {
                    if (reporterLogicManagement.getReporters()[j] != null && reporterLogicManagement.getReporters()[j].getReporterID() == reporterID) {
                        reporter = reporterLogicManagement.getReporters()[j];
                        break;
                    }
                }
                if (reporter != null) {
                    break;
                }
                System.out.println("Không tồn tại ID phóng viên vừa nhập, vui lòng nhập lại!");
            } while (true);

            System.out.print("Nhập số lượng kiểu bài mà phóng viên đã viết: ");
            int articleTypeNumber;
            do {
                articleTypeNumber = new Scanner(System.in).nextInt();
                if (articleTypeNumber >= 1 && articleTypeNumber <= 5) {
                    break;
                }
                System.out.println("Mỗi phóng viên chỉ được viết tối đa 5 kiểu bài khác nhau, vui lòng nhập lại!");
            } while (true);

            PayrollDetail[] details = new PayrollDetail[articleTypeNumber];
            int count = 0;
            for (int j = 0; j < articleTypeNumber; j++) {
                System.out.print("Nhập ID kiểu bài viết thứ "+ (j+1) +" mà phóng viên đã viết: ");
                int articleTypeID;
                ArticleType articleType = null;
                do {
                    articleTypeID = new Scanner(System.in).nextInt();
                    for (int k = 0; k < articleTypeLogicManagement.getArticleTypes().length; k++) {
                        if (articleTypeLogicManagement.getArticleTypes()[k] != null && articleTypeLogicManagement.getArticleTypes()[k].getArticleID() == articleTypeID) {
                            articleType = articleTypeLogicManagement.getArticleTypes()[k];
                            break;
                        }
                    }
                    if (articleType != null) {
                        break;
                    }
                    System.out.println("Không tồn tại ID kiểu bài viết vừa nhập, vui lòng nhập lại!");
                } while (true);
                System.out.print("Kiểu bài này phóng viên đã viết bao nhiêu bài: ");
                int articleNumber = new Scanner(System.in).nextInt();
                PayrollDetail payrollDetail = new PayrollDetail(articleType, articleNumber);
                details[count] = payrollDetail;
                count++;
            }
            Payroll payroll = new Payroll(reporter, details);
            savePayroll(payroll);
        }
    }

    public void savePayroll(Payroll payroll) {
        for (int i = 0; i < payrolls.length; i++) {
            if (payrolls[i] == null) {
                payrolls[i] = payroll;
                break;
            }
        }
    }

    public void calculateSalary() {
        for (int i = 0; i < payrolls.length; i++) {
            Payroll payroll = payrolls[i];
            if (payroll == null) {
                continue;
            }
            Reporter reporter = payroll.getReporter();
            PayrollDetail[] details = payroll.getDetails();
            double salary = 0;
            for (int j = 0; j < details.length; j++) {
                ArticleType articleType = details[j].getArticleType();
                salary += articleType.getPrice() * details[j].getArticleNumber();
            }
            System.out.println("Lương của phóng viên "+ reporter.getName() + " là: " + salary);
        }
    }

    public void sortPayroll() {
        if (!reporterLogicManagement.reporterIsNotEmpty() || !articleTypeLogicManagement.articleTypesIsNotEmpty()) {
            System.out.println("Không có dữ liệu phóng viên hoặc kiểu bài viết, vui lòng tạo đủ dữ liệu trước khi sắp xếp!");
            return;
        }

        System.out.println("1. Sắp xếp danh sách Bảng tính công theo Họ tên phóng viên");
        System.out.println("2. Sắp xếp danh sách Bảng tính công theo Số lượng bài viết (giảm dần)");
        System.out.print("Mời bạn chọn: ");
        int choiceArrangement;
        do {
            choiceArrangement = new Scanner(System.in).nextInt();
            if (choiceArrangement >= 1 && choiceArrangement <= 2) {
                break;
            }
            System.out.println("Chọn sai chức năng, vui lòng chọn lại!");
        } while (true);

        switch (choiceArrangement) {
            case 1:
                sortByName();
                showPayroll();
                break;
            case 2:
                sortByDecreasedArticleNumber();
                showPayroll();
                break;
        }
    }

    private void sortByDecreasedArticleNumber() {

    }

    private void sortByName() {
        String[] reporterNames = new String[100];
        for (int i = 0; i < payrolls.length - 1; i++) {
            Payroll payroll = payrolls[i];
            if (payroll == null) {
                continue;
            }
            reporterNames[i] = payroll.getReporter().getName();
        }

        for (int i = 0; i < reporterNames.length - 1; i++) {
            for (int j = 0; j < reporterNames.length - i - 1; j++) {
                if (reporterNames[j].compareTo(reporterNames[j + 1]) > 0) {
                    String temp = reporterNames[j];
                    reporterNames[j] = reporterNames[j + 1];
                    reporterNames[j + 1] = temp;
                }
            }
        }
    }
}
