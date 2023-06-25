package day13_OOP.logicHandle;

import day13_OOP.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MenuLogicManagement {
    private CustomerLogicManagement customerLogicManagement = new CustomerLogicManagement();
    private ServiceLogicManagement serviceLogicManagement = new ServiceLogicManagement();

    private InvoiceLogicManagement invoiceLogicManagement = new InvoiceLogicManagement(customerLogicManagement, serviceLogicManagement);

    public void menu() {
        while(true){
            printMenuContents();
            int choice = choiceFunction();
            switch (choice) {
                case 1:
                    customerLogicManagement.inputCustomer();
                    break;
                case 2:
                    customerLogicManagement.showCustomer();
                    break;
                case 3:
                    serviceLogicManagement.inputService();
                    break;
                case 4:
                    serviceLogicManagement.showService();
                    break;
                case 5:
                    invoiceLogicManagement.inputInvoice();
                    break;
                case 6:
                    invoiceLogicManagement.showInvoice();
                    break;
                case 7:
                    showSortMenu();
                    break;
                case 8:
                    invoiceLogicManagement.calculateInvoice();
                    break;
                case 9:
                    return;
            }
        }
    }
    public void showSortMenu() {
        System.out.println("1. Sắp xếp theo Họ tên khách hàng");
        System.out.println("2. Sắp xếp theo Số lượng sử dụng (giảm dần)");
        System.out.println("3. Quay lại menu tổng");
        System.out.print("Mời bạn chọn: ");
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice < 1 || choice > 3){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.println("Vui lòng nhập từ 1 - 3: ");
            }
        } while (true);
        switch (choice){
            case 1:
                invoiceLogicManagement.sortByCustomerName();
                break;
            case 2:
                invoiceLogicManagement.sortByServiceInvoice();
                break;
            case 3:
                return;
        }
    }
    public int choiceFunction() {
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice < 1 || choice > 9){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.println("Vui lòng nhập từ 1 - 9: ");
            }
        } while (true);
        return choice;
    }

    public void printMenuContents() {
        System.out.println("==================MENU QUẢN LÝ HÓA ĐƠN BÁN HÀNG================");
        System.out.println("1. Nhập danh sách khách hàng");
        System.out.println("2. In ra danh sách khách hàng đã có");
        System.out.println("3. Nhập danh sách dịch vụ");
        System.out.println("4. In ra danh sách dịch vụ đã có");
        System.out.println("5. Nhập hóa đơn cho khách hàng");
        System.out.println("6. In danh sách hóa đơn");
        System.out.println("7. Sắp xếp danh sách hóa đơn");
        System.out.println("8. Lập bảng kê số tiền phải trả cho mỗi khách hàng");
        System.out.println("9. Thoát chương trình");
        System.out.print("Mời bạn chọn: ");
    }

}
