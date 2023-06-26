package day14_test.LogicManagement;

import day14_test.Exception.CheckNumberException;
import day14_test.entity.Employee;
import day14_test.entity.Product;
import day14_test.entity.SaleList;
import day14_test.entity.SaleListDetail;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaleListLogicManagement {
    private SaleList[] saleLists = new SaleList[100];
    private EmployeeLogicManagement employeeLogicManagement;
    private ProductLogicManagement productLogicManagement;

    public SaleListLogicManagement(EmployeeLogicManagement employeeLogicManagement, ProductLogicManagement productLogicManagement) {
        this.employeeLogicManagement = employeeLogicManagement;
        this.productLogicManagement = productLogicManagement;
    }


    public void inputSaleList() {
        if (!employeeLogicManagement.employeeIsNotEmpty() || !productLogicManagement.productIsNotEmpty()) {
            System.out.println("Không có dữ liệu nhân viên hoặc mặt hàng, vui lòng tạo đủ dữ liệu trước khi lập danh sách bán hàng!");
            return;
        }

        System.out.print("Nhập số nhân viên bạn muốn lập danh sách bán hàng: ");
        int employeeNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < employeeNumber; i++) {
            //Nhập thông tin nhân viên và check xem có tồn tại NV đó hay không
            System.out.println("Nhập thông tin nhân viên thứ "+ (i+1) + " bạn muốn lập danh sách bán hàng: ");
            System.out.print("Nhập ID nhân viên: ");
            int employeeID;
            Employee employee = null;
            do {
                try {
                    employeeID = new Scanner(System.in).nextInt();
                    if (employeeID < 1000){
                        throw new CheckNumberException();
                    }
                    for (int j = 0; j < employeeLogicManagement.getEmployees().length; j++) {
                        if (employeeLogicManagement.getEmployees()[j] != null && employeeLogicManagement.getEmployees()[j].getIdEmployee() == employeeID) {
                            employee = employeeLogicManagement.getEmployees()[j];
                            break;
                        }
                    }
                    if (employee != null) {
                        break;
                    }
                    System.out.println("Không tồn tại ID nhân viên vừa nhập, vui lòng nhập lại!");
                } catch (InputMismatchException e) {
                    System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                } catch (CheckNumberException e){
                    System.out.print("Vui lòng nhập mã khách hàng >= 1000: ");
                }
            } while (true);
            //nhập số mặt hàng nhân viên đã bán và try catch số đó
            System.out.print("Nhân viên thứ " + (i+1) + " đã bán bao nhiêu mặt hàng: ");
            int productNumber;
            do {
                try {
                    productNumber = new Scanner(System.in).nextInt();
                    if (productNumber < 1 || productNumber > 5){
                        throw new CheckNumberException();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                } catch (CheckNumberException e){
                    System.out.println("Mỗi nhân viên chỉ được bán tối đa 5 mặt hàng khác nhau, vui lòng nhập lại!");
                }
            } while (true);

            SaleListDetail[] details = new SaleListDetail[productNumber];
            int count = 0;
            //duyệt từng mặt hàng và check xem ID mặt hàng đó có đúng không
            for (int j = 0; j < productNumber; j++) {
                System.out.print("Nhập ID mặt hàng thứ "+ (j+1) + " nhân viên đã bán: ");
                int IdProduct;
                Product product = null;
                do {
                    try {
                        IdProduct = new Scanner(System.in).nextInt();
                        if (IdProduct < 100){
                            throw new CheckNumberException();
                        }
                        for (int k = 0; k < productLogicManagement.getProducts().length; k++) {
                            if (productLogicManagement.getProducts()[k] != null && productLogicManagement.getProducts()[k].getIdProduct() == IdProduct) {
                                product = productLogicManagement.getProducts()[k];
                                break;
                            }
                        }
                        if (product != null) {
                            break;
                        }
                        System.out.println("Không tồn tại ID mặt hàng vừa nhập, vui lòng nhập lại!");
                    } catch (InputMismatchException e) {
                        System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                    } catch (CheckNumberException e){
                        System.out.print("Vui lòng nhập mã mặt hàng >= 1000: ");
                    }
                } while (true);
                System.out.print("Mặt hàng này đã bán số lượng bao nhiêu: ");
                int saleNumber;
                do {
                    try {
                        saleNumber = new Scanner(System.in).nextInt();
                        if (saleNumber > productLogicManagement.getProducts()[j].getProductNumber()) {
                            throw new CheckNumberException();
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                    } catch (CheckNumberException e) {
                        System.out.println("Số lượng mặt hàng bán ra phải nhỏ hơn hoặc bằng số lượng mặt hàng nhập!");
                    }
                } while (true);
                SaleListDetail saleListDetail = new SaleListDetail(product, saleNumber);
                details[count] = saleListDetail;
                count++;
            }
            SaleList saleList = new SaleList(employee, details);
            saveSaleList(saleList);
        }


    }

    public void saveSaleList(SaleList saleList) {
        for (int i = 0; i < saleLists.length; i++) {
            if (saleLists[i] == null){
                saleLists[i] = saleList;
                break;
            }
        }
    }

    public void showSaleList() {
        for (int i = 0; i < saleLists.length; i++) {
            if (saleLists[i] != null){
                System.out.println(saleLists[i]);
            }
        }
    }

    public void calculateSaleList() {
        for (int i = 0; i < saleLists.length; i++) {
            SaleList saleList = saleLists[i];
            if (saleList == null) {
                continue;
            }
            Employee employee = saleList.getEmployee();
            SaleListDetail[] details = saleList.getDetails();
            double revenue = 0;
            for (int j = 0; j < details.length; j++) {
                Product product = details[j].getProduct();
                revenue += product.getPrice() * details[j].getSaleQuantity();
            }
            System.out.println("Doanh thu của nhân viên "+ employee.getName() + " là: " + revenue);
        }
    }

    public boolean isEmptyEmployee() {
        for (int i = 0; i < employeeLogicManagement.getEmployees().length; i++) {
            if (employeeLogicManagement.getEmployees()[i] != null){
                return false;
            }
        }
        return true;
    }
    public void sortByCustomerName() {
        if (isEmptyEmployee()) {
            System.out.println("Chưa có dữ liệu danh sách bán hàng, vui lòng nhập dữ liệu trước khi sắp xếp.");
            return;
        }
        for (int i = 0; i < saleLists.length - 1; i++) {
            for (int j = i + 1; j < saleLists.length; j++) {
                if (saleLists[j] != null && (saleLists[i].getEmployee().getName().compareToIgnoreCase(saleLists[j].getEmployee().getName()) > 0)) {
                    SaleList temp = saleLists[i];
                    saleLists[i] = saleLists[j];
                    saleLists[j] = temp;
                }
            }
        }
        showSaleList();
    }

    public void sortByProductGroup() {
        if (isEmptyEmployee()) {
            System.out.println("Chưa có dữ liệu danh sách bán hàng, vui lòng nhập dữ liệu trước khi sắp xếp.");
            return;
        }
        for (int i = 0; i < saleLists.length - 1; i++) {
            for (int j = i + 1; j < saleLists.length; j++) {
                if (saleLists[j] != null && (saleLists[i].getDetails()[i].getProduct().getProductGroup().name().compareToIgnoreCase(saleLists[j].getDetails()[j].getProduct().getProductGroup().name()) > 0)) {
                    SaleList temp = saleLists[i];
                    saleLists[i] = saleLists[j];
                    saleLists[j] = temp;
                }
            }
        }
        showSaleList();
    }
}
