package day13_OOP.entity;

import day13_OOP.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service implements InputInfo{
    private static int AUTO_IDSERVICE = 100;
    private int IdService;
    private String serviceName;
    private double price;
    private String unit;

    public Service(int idService, String serviceName, double price, String unit) {
        this.IdService = idService;
        this.serviceName = serviceName;
        this.price = price;
        this.unit = unit;
    }

    public Service() {
        this.IdService = AUTO_IDSERVICE;
        AUTO_IDSERVICE++;
    }

    public int getIdService() {
        return IdService;
    }

    public void setIdService(int idService) {
        IdService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Service{" +
                "IdService=" + IdService +
                ", serviceName='" + serviceName + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
    /* Khai báo lớp Dịch vụ (mã DV, tên DV, giá cước, đơn vị tính) mã DV là một số nguyên có 3 chữ số, tự động tăng.*/
    @Override
    public void inputInfo() {
        System.out.print("Nhập tên dịch vụ: ");
        this.setServiceName(new Scanner(System.in).nextLine());
        System.out.print("Nhập giá cước dịch vụ: ");
        do {
            try {
                this.setPrice(new Scanner(System.in).nextDouble());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            }
        } while (true);

        System.out.print("Nhập đơn vị tính dịch vụ: ");
        this.setUnit(new Scanner(System.in).nextLine());
    }
}
