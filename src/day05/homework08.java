/*Bài 8: Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k.*/
package day05;
import java.util.Scanner;
public class homework08 {
    public static void main(String[] args) {
        int[][] A = { {1, 5, 7}, {6, 9, 3} };//Ma trận A có cấp 2*3
        int[][] B = { {22, 19, 25}, {24, 18, 14}, {12, 34, 36}};//Ma trận A có cấp 3*3

        int m = A.length; //số hàng của ma trận A
        int n = B[0].length; // số cột của ma trận B

        int[][] result = multiplyMatrix(A, B, m, n);
        System.out.println("Kết quả tích 2 ma trận A và B: ");
        printMatrix(result);
    }
    private static int[][] multiplyMatrix(int[][] A, int[][] B, int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    private static void printMatrix(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
