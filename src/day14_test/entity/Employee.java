package day14_test.entity;

import day14_test.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee extends Person {
    private static int AUTO_IDEMPLOYEE = 1000;
    private int IdEmployee;
    private int date;
    private int month;
    private int year;

    public Employee(String name, String address, String telephone, int idEmployee, int date, int month, int year) {
        super(name, address, telephone);
        this.IdEmployee = idEmployee;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public Employee() {
        this.IdEmployee = AUTO_IDEMPLOYEE;
        AUTO_IDEMPLOYEE++;
    }

    public int getIdEmployee() {
        return IdEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        IdEmployee = idEmployee;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "IdEmployee=" + IdEmployee +
                ", date=" + date +
                ", month=" + month +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                "}\n";
    }

    public void inputInfoEmployee() {
        super.inputInfo();
        System.out.println("Nhập ngày ký hợp đồng: ");
        int date;
        do {
            try {
                date = new Scanner(System.in).nextInt();
                if (date < 1 || date > 31){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.println("Nhập ngày từ 1-31!");
            }
        } while (true);
        this.setDate(date);

        System.out.println("Nhập tháng ký hợp đồng: ");
        int month;
        do {
            try {
                month = new Scanner(System.in).nextInt();
                if (month < 1 || month > 12){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.println("Nhập tháng từ 1-12!");
            }
        } while (true);
        this.setMonth(month);

        System.out.println("Nhập năm ký hợp đồng: ");
        int year;
        do {
            try {
                year = new Scanner(System.in).nextInt();
                if (year > 2023){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.println("Nhập năm nhỏ hơn 2023!");
            }
        } while (true);
        this.setYear(year);
    }


}
