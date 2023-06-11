/*Bài 6: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương. Kiểm tra xem
        a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).*/
package day05;

import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        checkMangDoiXung(a, n);
    }
    public static void checkMangDoiXung(int[] a, int n){
        int k = 1;
        for (int i = 0; i <= n/2; i++) {
            if (a[i] != a[n - i - 1]) {
                k = 0;
                break;
            }
        }
        if (k == 0) {
            System.out.println("Đây không phải mảng đối xứng!");
        } else {
            System.out.println("Đây là mảng đối xứng!");
        }
    }
}
