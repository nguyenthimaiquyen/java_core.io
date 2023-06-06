/*Bài 5: Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n*m.
        Ví dụ với n=5, m=4:*/
package day04;
import java.util.Scanner;
public class homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();
        System.out.print("Nhập số m = ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
