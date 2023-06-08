/*Bài 5: Viết chương trình In ra Tam giác pascal như sau:
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1*/
package day05;
public class assignment05 {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][0] = 1;
            array[i][i] = 1;
            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
