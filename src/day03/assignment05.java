/*Bài 5: Viết một chương trình Java để đảo ngược một số nguyên dương nhập từ bàn phím
        bằng cách sử dụng vòng lặp while và do-while và break và continue.
        Chương trình sẽ yêu cầu người dùng nhập một số nguyên dương, sau đó đảo ngược và in ra số đã đảo ngược.
        Ví dụ: Nhập vào số 123456 --> Kết quả nhận được là số: 654321*/
package day03;
import java.util.Scanner;
public class assignment05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String reversed = "";
        while (num != 0) {
            reversed = reversed + (num % 10 + "");
            num = num / 10;
        }
        System.out.println("A reversed string is: " + reversed);
    }
}
