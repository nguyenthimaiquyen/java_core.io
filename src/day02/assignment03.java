package day02;

import java.util.Scanner;
//Bài 3: Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.
public class assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        do {
            System.out.println("Nhập chiều dài của hình chữ nhật: ");
            a = sc.nextDouble();
        } while (a <= 0);
        double b;
        do {
            System.out.println("Nhập chiều rộng của hình chữ nhật: ");
            b = sc.nextDouble();
        } while (b <= 0);
        double chuVi = (a+b)*2;
        double dienTich = a*b;
        System.out.println("Chu vi của hình chữ nhật = " + chuVi);
        System.out.println("Diện tích của hình chữ nhật = " + dienTich);
    }
}
