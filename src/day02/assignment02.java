package day02;

import java.util.Scanner;
//Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn phím, a khác 0.
public class assignment02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        do {
            System.out.println("Nhập a khác 0: ");
            a = sc.nextDouble();
        } while (a == 0);
        System.out.println("Nhập b = ");
        double b = sc.nextDouble();
        System.out.println("Nhập c = ");
        double c = sc.nextDouble();
        giaiPhuongTrinh(a, b, c);
    }
    public static void giaiPhuongTrinh(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt là: x1 = "+ x1 + ", x2 = "+ x2);
        }
    }

}
