package day02;

import java.util.Scanner;

//Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a khác 0.
public class assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Nhập a = ");
            a = sc.nextInt();
        } while (a == 0);
        System.out.println("Nhập b = ");
        int b = sc.nextInt();
        double x = (double) -b / a;
        System.out.println("Nghiệm của phương trình bậc nhất x = " + (Math.ceil(x * 1000)/1000));

    }
}