package day13_OOP.logicHandle;

import day13_OOP.Exception.CheckNumberException;
import day13_OOP.entity.Customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerLogicManagement {
    private Customer[] customers = new Customer[100];

    public Customer[] getCustomer() {
        return customers;
    }

    public void setCustomer(Customer[] customer) {
        this.customers = customer;
    }

    public void inputCustomer() {
        System.out.print("Bạn muốn nhập bao nhiêu khách hàng: ");
        int customerNumber;
        do {
            try {
                customerNumber = new Scanner(System.in).nextInt();
                if (customerNumber < 1 || customerNumber > 100){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.print("Vui lòng nhập số khách hàng từ 1 - 100: ");
            }
        } while (true);
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("Nhập thông tin khách hàng thứ "+ (i + 1) + ": ");
            Customer customer = new Customer();
            customer.inputInfo();
            saveCustomer(customer);
        }
    }

    public void saveCustomer(Customer customer) {
        for (int j = 0; j < customers.length; j++) {
            if (customers[j] == null) {
                customers[j] = customer;
                break;
            }
        }
    }

    public void showCustomer() {
        for (int j = 0; j < customers.length; j++) {
            if (customers[j] != null) {
                System.out.println(customers[j]);
            }
        }
    }


    public boolean customerIsNotEmpty() {
        for (int j = 0; j < customers.length; j++) {
            if (customers[j] != null) {
                return true;
            }
        }
        return false;
    }
}
