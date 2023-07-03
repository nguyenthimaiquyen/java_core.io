package day15_Collection.LogicManagement;

import day15_Collection.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

/*      1. Nhập danh sách công nhân mới.
        2. In ra danh sách các công nhân đã có
        3. Nhập danh sách xưởng sản xuất.
        4. In ra danh sách xưởng đã có
        5. Lập Bảng danh sách chấm công cho từng công nhân
        6. in danh sách chấm công
        7. Sắp xếp Bảng danh sách phân công
        a. Theo tên công nhân
        b. Theo xưởng
        8. Lập bảng kê thu nhập cho mỗi công nhân trong tháng.*/
public class MenuLogicManagement {
    private WorkerLogicManagement workerLogicManagement = new WorkerLogicManagement();
    private FactoryLogicManagement factoryLogicManagement = new FactoryLogicManagement();
    private TimesheetLogicManagement timesheetLogicManagement = new TimesheetLogicManagement(factoryLogicManagement, workerLogicManagement);

    public void menu() {
       while (true) {
           menuContent();
           int choice = choiceFunction();
           switch (choice) {
               case 1:
                   workerLogicManagement.inputWorker();
                   break;
               case 2:
                   workerLogicManagement.showWorker();
                   break;
               case 3:
                   factoryLogicManagement.inputFactory();
                   break;
               case 4:
                   factoryLogicManagement.showFactory();
                   break;
               case 5:
                   timesheetLogicManagement.inputTimesheet();
                   break;
               case 6:
                   timesheetLogicManagement.showTimesheet();
                   break;
               case 7:
                   sortMenu();
                   break;
               case 8:
                   timesheetLogicManagement.calculateSalary();
                   break;
               case 9:
                   return;
           }
       }
    }

    public void sortMenu() {
        System.out.println("1. Theo tên công nhân");
        System.out.println("2. Theo xưởng");
        System.out.println("3. Quay lại menu tổng");
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice < 1 || choice > 3) {
                    throw new CheckNumberException();
                }
                break;
            } catch ( InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e) {
                System.out.print("Vui lòng chọn từ 1 - 3: ");
            }
        } while (true);

        switch(choice){
            case 1:
                timesheetLogicManagement.sortByWorkerName();
                break;
            case 2:
                timesheetLogicManagement.sortByFactory();
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
                if (choice < 1 || choice > 9) {
                    throw new CheckNumberException();
                }
                break;
            } catch ( InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e) {
                System.out.print("Vui lòng chọn từ 1 - 9: ");
            }
        } while (true);
        return choice;
    }

    public void menuContent() {
        System.out.println("================MENU QUẢN LÝ DANH SÁCH CHẤM CÔNG=================");
        System.out.println("1. Nhập danh sách công nhân mới");
        System.out.println("2. In danh sách các công nhân đã có");
        System.out.println("3. Nhập danh sách xưởng sản xuất");
        System.out.println("4. In danh sách xưởng đã có");
        System.out.println("5. Lập Bảng danh sách chấm công cho từng công nhân");
        System.out.println("6. in danh sách chấm công");
        System.out.println("7. Sắp xếp Bảng danh sách phân công");
        System.out.println("8. Lập bảng kê thu nhập cho mỗi công nhân trong tháng");
        System.out.println("9. Thoát chương trình");
        System.out.print("Mời bạn chọn: ");
    }

}
