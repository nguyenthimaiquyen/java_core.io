package day01;

//Bài 5: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân.

public class assignment05 {
    public static void main(String[] args) {
        int a = 59;
        int b = 14;
        double thuong = (double) a / b;

        System.out.println("Thương của " + a + "/" + b + " là: " + Math.ceil(thuong * 1000)/ 1000);
    }

}
