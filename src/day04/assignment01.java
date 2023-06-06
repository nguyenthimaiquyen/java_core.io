/*Bài 1: Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
        Nhập các phần tử mảng, In mảng ra màn hình
        Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
        VD: [1,4,7,6,2,3] -> [1,5,7,7,3,3]*/
package day04;
import java.util.Scanner;
public class assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần từ của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Các phần tử của mảng trước thay đổi: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        //Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println();
        System.out.println("Các phần tử của mảng sau khi thay đổi: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
