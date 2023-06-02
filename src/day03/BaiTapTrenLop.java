package day03;

import java.util.concurrent.ThreadLocalRandom;

/*Bài 1: Viết chương trình lấy 1 số nguyên bất kỳ trong khoảng từ 0 đến 1000 và tính tổng các chữ số của nó?
        VD: Tổng các chữ số của số 1000 = 1;*/
public class BaiTapTrenLop {
    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt(1, 1001);
        int sum = calculateSum(random);
        System.out.println("Tổng các chữ số của "+random + " là: "+ sum);
    }
    public static int calculateSum(int n) {
        int d = 0;
        while (n != 0) {
            d += n % 10;
            n = n/ 10;
        }
        return d;
    }

}
