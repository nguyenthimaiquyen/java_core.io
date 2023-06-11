/*Bài 7: Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
        Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.*/
package day05;

import java.util.Scanner;

public class homework07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy n = ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int value;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            value = sc.nextInt();
            if (checkTrung(array, n, value)) {
                System.out.println("Giá trị bị trùng vui lòng nhập lại!");
                i--;
            } else {
                array[i] = value;
            }
        }
        //in dãy ra
        System.out.println("Dãy sau khi nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static boolean checkTrung(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
