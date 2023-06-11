/*Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Tìm số lớn thứ hai và vị trí
        của nó trong dãy. Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.*/
package day05;
import java.util.Scanner;
public class homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        findSecondMax(a, n);
    }
    public static void findSecondMax(int[] a, int n) {
        //sắp xếp mảng tăng dần
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //in mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //in số lớn thứ 2 và vị trí nếu có
        if (n < 2 || (a[n-1] == a[n-2])) {
            System.out.println("Không có số lớn thứ 2!");
            //sai trong test case 1 2 2 3 3 => sửa lại
        } else {
            int secondMax = a[n-2];
            System.out.print("Số lớn thứ 2 trong mảng là: " + a[n-2]);
            System.out.print(" tại vị trí ");
            for (int i = 0; i < n; i++) {
                if (a[i] == secondMax) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
