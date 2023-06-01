package day02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*Đề bài: Viết chương trình tạo hai biến kiểu int number và randomNumber với:

        number: được nhập vào từ bàn phím
        randomNumber: được sinh ngẫu nhiên từ 1 đến 100
        So sánh hai số với nhau sử dụng toán tử 3 ngôi*/
public class sosanh2so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập number: ");
        int number = sc.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Giá trị của randomNumber là: " + randomNumber);
        String result = (number > randomNumber) ? "number lớn hơn randomNumber" : "number nhỏ hơn hoặc bằng randomNumber";
        System.out.println(result);
    }
}
