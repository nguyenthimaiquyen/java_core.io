package day01;

//Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.

public class assignment02 {
    public static void main(String[] args) {
        double r = 20;
        final double PI = 3.14;
        System.out.println("Chu vi hình tròn: " + (2*r*PI));
        System.out.println("Diện tích hình tròn: " + (r*r*PI));
    }
}
