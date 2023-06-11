/*Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c (b < c).
        Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].*/
package day05;
import java.util.Scanner;
public class homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Nhập b sao cho b < c: ");
        int b = sc.nextInt();
        System.out.print("Nhập c sao cho b < c: ");
        int c = sc.nextInt();

        double average = calculateAverage(a, b, c);
        System.out.println("Trung bình cộng các phần tử của dãy nằm trong đoạn ["+b+","+c+"] là: "+ average);
    }
    public static double calculateAverage(int[] a, int b, int c) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b && a[i] <= c) {
                sum += a[i];
                count++;
            }
        }
        if (count != 0) {
            return (double) sum / count;
        } else {
            return 0;
        }
    }
}
