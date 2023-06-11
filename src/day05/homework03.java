/*Bài 3: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Đếm xem có bao nhiêu cặp 2 phần tử
        liên tiếp bằng nhau trong dãy trên (tức là đếm số cặp a[i], a[i+1] sao cho a[i] = a[i+1];
        nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).*/
package day05;
import java.util.Scanner;
public class homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int countNum = count(a);
        System.out.print("Số cặp 2 phần tử liên tiếp bằng nhau trong dãy: " + countNum);
    }
    public static int count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i+1]) {
                count++;
            }
        }
        return count;
    }
}
