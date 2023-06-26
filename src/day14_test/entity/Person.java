package day14_test.entity;

import java.util.Scanner;

public class Person implements InputInfo{
    protected String name;
    protected String address;
    protected String telephone;

    public Person(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên khách hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ của khách hàng: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại của khách hàng: ");
        this.setTelephone(new Scanner(System.in).nextLine());
    }
}
