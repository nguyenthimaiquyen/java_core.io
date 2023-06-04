/* Bài 1: Viết chương trình thực hiện in ra các số từ 1 đến 100.
Trong đó, những số nào chia hết cho 3 thì in chữ Fizz, những số nào chia hết cho 5 thì in chữ Buzz,
những số nào chia hết cho cả 3 và 5 thì in chữ FizzBuzz */
package day03;
public class assignment01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
