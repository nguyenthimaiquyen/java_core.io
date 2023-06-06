/*Bài 1: Viết chương trình Java để tính giá trị trung bình của một mảng các số nguyên trừ giá trị lớn nhất và nhỏ nhất*/
package day04;

import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] intArray = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        double average = tinhTrungBinh(intArray, n);
        System.out.println("Giá trị trung bình của mảng trừ giá trị lớn nhất và nhỏ nhất là: " + average);
    }
    public static double tinhTrungBinh(int[] intArray, int n) {
        //tìm max và min
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < n; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        //đếm số lần xuất hiện max và min
        int countMax = 0;
        int countMin = 0;
        for (int i = 0; i < n; i++) {
            if (intArray[i] == max) {
                countMax++;
            }
            if (intArray[i] == min) {
                countMin++;
            }
        }
        //tính sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (intArray[i] != max && intArray[i] != min) {
                sum += intArray[i];
            }
        }
        double average = (double) sum / (n - countMax - countMin);
        return average;
    }
}
