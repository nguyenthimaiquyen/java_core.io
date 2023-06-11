/*Bài 11: Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
        Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.*/
package day05;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = nhapMaTran(sc);
        timMaxMin(array);
    }
    private static void timMaxMin(int[][] array) {
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("max = "+max+", min = "+min);
    }

    public static int[][] nhapMaTran(Scanner sc) {
        System.out.print("Nhập số hàng của ma trận: ");
        int m = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        System.out.print("Nhập các phần tử của ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array["+i+"]["+j+"] = ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        return array;
    }
}
