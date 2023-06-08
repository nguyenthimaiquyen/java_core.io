/*Bài 3: Viết chương trình cũng là in ra tam giác vuông nhưng các số đơn vị của từng phần tử tăng dần lên 1 giống như sau:
        1
        2 3
        4 5 6
        7 8 9 10*/
package day05;
public class assignment03 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
