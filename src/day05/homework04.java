/*Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Tìm số lớn thứ hai và vị trí
        của nó trong dãy. Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.*/
package day05;
import java.util.ArrayList;
import java.util.Scanner;
public class homework04 {
    public static void main(String[] args) {
        int[] array = {1,8,9,7,2,3,4,8,7,6,8,9};
        int n = array.length;
        findSecondMax(array, n);
    }
    public static void findSecondMax(int[] a, int n) {
        //tìm phần tử lớn nhất trong mảng
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        //tạo 1 arraylist và add các phần tử ngoại trừ max vào list
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (a[i] != max) {
                list.add(a[i]);
            }
        }
        //tìm phần tử max trong list
        int secondMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > secondMax) {
                secondMax = list.get(i);
            }
        }
        //in ra chỉ số của phần tử max
        System.out.println("Số lớn thứ 2 trong mảng ban đầu: " + secondMax);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == secondMax) {
                System.out.println("Vị trí trong mảng mới: " + i);
            }
        }
    }
}
