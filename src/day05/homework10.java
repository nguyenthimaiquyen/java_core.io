/*Bài 10: Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương
        trong đoạn [m,n]. Có bao nhiêu số chính phương?*/
package day05;

import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số tự nhiên m và n, sao cho m < n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Các số chính phương trong đoạn từ ["+m+","+n+"]: ");
        for (int i = m; i <= n; i++) {
           if (check(i)) {
               System.out.println(i + " ");
               count++;
           }
        }
        System.out.println("Số lượng số chính phương là: " + count);
    }
    public static boolean check(int i) {
        double d = Math.sqrt(i);
        return ((d - Math.floor(d)) == 0);
    }
}
