/*Bài 1: Viết chương trình in ra màn hình tam giác vuông có hình dạng sau đây:
        1
        12
        123
        1234
        12345*/
package day05;
public class assignment01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
