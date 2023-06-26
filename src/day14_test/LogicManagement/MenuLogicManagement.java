package day14_test.LogicManagement;

import day14_test.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLogicManagement {
    private EmployeeLogicManagement employeeLogicManagement = new EmployeeLogicManagement();
    private ProductLogicManagement productLogicManagement = new ProductLogicManagement();
    private SaleListLogicManagement saleListLogicManagement = new SaleListLogicManagement(employeeLogicManagement, productLogicManagement);

    public void menu() {
        while(true){
            printMenuContents();
            int choice = choiceFunction();
            switch (choice) {
                case 1:
                    productLogicManagement.inputProduct();
                    break;
                case 2:
                    productLogicManagement.showProduct();
                    break;
                case 3:
                    employeeLogicManagement.inputEmployee();
                    break;
                case 4:
                    employeeLogicManagement.showEmployee();
                    break;
                case 5:
                    saleListLogicManagement.inputSaleList();
                    break;
                case 6:
                    saleListLogicManagement.showSaleList();
                    break;
                case 7:
                    showSortMenu();
                    break;
                case 8:
                    saleListLogicManagement.calculateSaleList();
                    break;
                case 9:
                    return;
            }
        }
    }

    public void showSortMenu() {
        System.out.println("1. Sắp xếp theo họ tên nhân viên");
        System.out.println("2. Sắp xếp theo nhóm mặt hàng");
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
                saleListLogicManagement.sortByCustomerName();
                break;
            case 2:
                saleListLogicManagement.sortByProductGroup();
                break;
            case 3:
                return;
        }
    }

    public void printMenuContents() {
        System.out.println("==================MENU QUẢN LÝ DANH SÁCH BÁN HÀNG================");
        System.out.println("1. Nhập danh sách mặt hàng mới");
        System.out.println("2. In ra danh sách các mặt hàng đã có");
        System.out.println("3. Nhập danh sách nhân viên");
        System.out.println("4. In ra danh sách nhân viên đã có");
        System.out.println("5. Lập Bảng danh sách bán hàng cho từng nhân viên");
        System.out.println("6. In danh sách bán hàng của từng nhân viên");
        System.out.println("7. Sắp xếp Bảng danh sách bán hàng");
        System.out.println("8. Lập bảng kê doanh thu cho mỗi nhân viên");
        System.out.println("9. Thoát chương trình");
        System.out.print("Mời bạn chọn: ");
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
}
