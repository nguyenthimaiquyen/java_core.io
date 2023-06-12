/*Bài 5: Viết chương trình In ra Tam giác pascal như sau:
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1*/
package day05;

import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int k = 1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for ( int g = 0; g <= i; g++) {
                System.out.print(k + " ");
                k = k * (i - g) / (g + 1);
            }
            k++;
            System.out.println();
        }
    }
}
