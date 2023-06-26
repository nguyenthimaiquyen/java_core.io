package day14_test.entity;

import day14_test.Exception.CheckNumberException;
import day14_test.statics.ProductGroup;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Khai báo lớp Mặt hàng trong kho gồm các thuộc tính (mã hàng, Tên hàng, Nhóm hàng, Giá bán, Số lượng)
        – trong đó Nhóm hàng có thể là: Điện tử, Điện lạnh, Máy tính, Thiết bị văn phòng.
        Mã hàng là một số nguyên có 4 chữ số, tự động tăng.*/
public class Product implements InputInfo {
    private static int AUTO_IDPRODUCT = 1000;
    private int IdProduct;
    private String nameProduct;
    private ProductGroup productGroup;
    private double price;
    private int productNumber;

    public Product(int idProduct, String nameProduct, ProductGroup productGroup, double price, int productNumber) {
        this.IdProduct = idProduct;
        this.nameProduct = nameProduct;
        this.productGroup = productGroup;
        this.price = price;
        this.productNumber = productNumber;
    }

    public Product() {
        this.IdProduct = AUTO_IDPRODUCT;
        AUTO_IDPRODUCT++;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "IdProduct=" + IdProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", productGroup=" + productGroup +
                ", price=" + price +
                ", productNumber=" + productNumber +
                "}\n";
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên mặt hàng: ");
        this.setNameProduct(new Scanner(System.in).nextLine());
        System.out.println("Nhập nhóm mặt hàng: ");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        System.out.print("Mời bạn chọn: ");
        int choice;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
                if (choice < 1 || choice > 4){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.println("Vui lòng nhập từ 1 - 4: ");
            }
        } while (true);

        switch (choice){
            case 1:
                this.setProductGroup(ProductGroup.DIEN_TU);
                break;
            case 2:
                this.setProductGroup(ProductGroup.DIEN_LANH);
                break;
            case 3:
                this.setProductGroup(ProductGroup.MAY_TINH);
                break;
            case 4:
                this.setProductGroup(ProductGroup.THIET_BI_VAN_PHONG);
                break;
        }

        System.out.print("Nhập giá bán mặt hàng: ");
        do {
            try {
                this.setPrice(new Scanner(System.in).nextDouble());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            }
        } while (true);
        System.out.print("Nhập số lượng mặt hàng: ");
        do {
            try {
                this.setProductNumber(new Scanner(System.in).nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            }
        } while (true);
    }
}
