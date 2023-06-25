package day10_OOP.logicHandle;

import java.util.Scanner;

public class MenuLogicManagement {
    private ReporterLogicManagement reporterLogicManagement = new ReporterLogicManagement();
    private ArticleTypeLogicManagement articleTypeLogicManagement = new ArticleTypeLogicManagement();
    private PayrollLogicManagement payrollLogicManagement = new PayrollLogicManagement(reporterLogicManagement, articleTypeLogicManagement);
    public void menu() {
        while (true) {
            printMenuContents();
            int choice = choiceFunction();
            switch (choice) {
                case 1:
                    reporterLogicManagement.inputReporter();
                    break;
                case 2:
                    reporterLogicManagement.showReporter();
                    break;
                case 3:
                    articleTypeLogicManagement.inputArticleType();
                    break;
                case 4:
                    articleTypeLogicManagement.showArticleType();
                    break;
                case 5:
                    payrollLogicManagement.inputNewPayroll();
                    break;
                case 6:
                    payrollLogicManagement.showPayroll();
                    break;
                case 7:
                    payrollLogicManagement.sortPayroll();
                    break;
                case 8:
                    payrollLogicManagement.calculateSalary();
                    break;
                case 9:
                    return;
            }
        }
    }

    private int choiceFunction() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.println("Chọn sai chức năng, vui lòng chọn lại!");
        } while (true);
        return choice;
    }

    private void printMenuContents() {
        System.out.println("===============MENU BẢNG TÍNH CÔNG================");
        System.out.println("1. Nhập danh sách phóng viên");
        System.out.println("2. In ra danh sách phóng viên đã có");
        System.out.println("3. Nhập danh sách kiểu bài viết");
        System.out.println("4. In ra danh sách kiểu bài đã có");
        System.out.println("5. Lập Bảng tính công cho phóng viên");
        System.out.println("6. In Bảng tính công cho phóng viên");
        System.out.println("7. Sắp xếp danh sách Bảng tính công");
        System.out.println("8. Lập bảng kê thu nhập của mỗi phóng viên");
        System.out.println("9. Thoát chương trình");
        System.out.print("Mời bạn chọn: ");
    }

}
