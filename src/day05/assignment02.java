/*Bài 2: Viết chương trình cũng là in ra tam giác vuông nhưng các số trên 1 hàng đc lặp lại:
        1
        22
        333
        4444
        55555*/
package day05;

public class assignment02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
