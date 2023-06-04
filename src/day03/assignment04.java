/*Bài 4: Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n*m.
        Ví dụ với n=5, m=4*/
package day03;
import java.util.Scanner;
public class assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.print("enter m = ");
        int m = sc.nextInt();
        inHinhChuNhat(n, m);
    }
    private static void inHinhChuNhat(int n, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m-1 || j == 0 || j == n-1)  {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
