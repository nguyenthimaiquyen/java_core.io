/*Bài 12: Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0).
        Tính tổng đường chéo chính của ma trận này*/
package day05;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = nhapMaTran(sc);
        timTong(array);
    }
    private static void timTong(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của ma trận là: " +sum);
    }

    public static int[][] nhapMaTran(Scanner sc) {
        System.out.print("Nhập số hàng và số cột của ma trận: ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        System.out.print("Nhập các phần tử của ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array["+i+"]["+j+"] = ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        return array;
    }
}
