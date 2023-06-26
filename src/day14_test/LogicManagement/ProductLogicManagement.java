package day14_test.LogicManagement;


import day14_test.Exception.CheckNumberException;
import day14_test.entity.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductLogicManagement {
    private Product[] products = new Product[100];

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void inputProduct() {
        System.out.print("Bạn muốn nhập bao nhiêu mặt hàng mới : ");
        int productNumber;
        do {
            try {
                productNumber = new Scanner(System.in).nextInt();
                if (productNumber < 1 || productNumber > 1000){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.print("Vui lòng nhập số dịch vụ từ 1 - 1000: ");
            }
        } while (true);

        for (int i = 0; i < productNumber; i++) {
            System.out.println("Nhập thông tin mặt hàng thứ "+ (i+1)+": ");
            Product product = new Product();
            product.inputInfo();
            saveProduct(product);
        }
    }

    public void saveProduct(Product product) {
        for (int j = 0; j < products.length; j++) {
            if (products[j] == null) {
                products[j] = product;
                break;
            }
        }
    }

    public void showProduct() {
        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                System.out.println(products[j]);
            }
        }
    }

    public boolean productIsNotEmpty() {
        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                return true;
            }
        }
        return false;
    }
}
