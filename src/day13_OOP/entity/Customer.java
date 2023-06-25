package day13_OOP.entity;

import day13_OOP.Exception.CheckNumberException;
import day13_OOP.statics.CustomerType;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Khai báo lớp Khách hàng (mã KH, Họ tên, Địa chỉ, Số ĐT, Loại KH)
         – với Loại khách hàng có thể là: cá nhân, đại diện đơn vị hành chính,
         đại diện đơn vị kinh doanh, mã KH là một số nguyên có 5 chữ số, tự động tăng.*/
public class Customer implements InputInfo{
    private static int AUTO_IDCUSTOMER = 10000;
    private int IdCustomer;
    private String customerName;
    private String address;
    private String telephone;
    private CustomerType customerType;

    public Customer(int idCustomer, String customerName, String address, String telephone, CustomerType customerType) {
        this.IdCustomer = idCustomer;
        this.customerName = customerName;
        this.address = address;
        this.telephone = telephone;
        this.customerType = customerType;
    }

    public Customer() {
        this.IdCustomer = AUTO_IDCUSTOMER;
        AUTO_IDCUSTOMER++;
    }

    public int getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        IdCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return customerName;
    }

    public void setNameCustomer(String nameCustomer) {
        this.customerName = nameCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "IdCustomer=" + IdCustomer +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", customerType=" + customerType +
                '}';
    }


    @Override
    public void inputInfo() {
        System.out.print("Nhập tên khách hàng: ");
        this.setNameCustomer(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ của khách hàng: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại của khách hàng: ");
        this.setTelephone(new Scanner(System.in).nextLine());

        System.out.println("Chọn loại khách hàng: ");
        System.out.println("1. Cá nhân");
        System.out.println("2. Đại diện đơn vị hành chính");
        System.out.println("3. Đại diện đơn vị kinh doanh");
        System.out.print("Mời bạn chọn: ");
        int choiceCustomerType;
        do {
            try {
                choiceCustomerType = new Scanner(System.in).nextInt();
                if (choiceCustomerType < 1 || choiceCustomerType > 3){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.print("Vui lòng chọn loại khách hàng từ 1 - 3: ");
            }
        } while (true);

        switch (choiceCustomerType){
            case 1:
                this.setCustomerType(CustomerType.CA_NHAN);
                break;
            case 2:
                this.setCustomerType(CustomerType.DAI_DIEN_DON_VI_HANH_CHINH);
                break;
            case 3:
                this.setCustomerType(CustomerType.DAI_DIEN_DON_VI_KINH_DOANH);
                break;
        }

    }
}
