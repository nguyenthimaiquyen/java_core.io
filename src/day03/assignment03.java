/* Bài 3: Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n*m.
Ví dụ với n=5, m=4: */
package day03;
import java.util.Scanner;
public class assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n = ");
        int n = sc.nextInt();
        System.out.println("Nhập số m = ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
