/*Bài 4:  Viết chương trình Java để đảo ngược các từ (không phải đảo ngược các chữ cái) trong một chuỗi cho trước
        Chuỗi cho trước: Reverse words in a given string
        Chuỗi được đảo ngược các từ: string given a in words Reverse*/
package day03;

import java.util.Scanner;

public class BaiTapTrenLop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The reversed string is: " + reverse(str));
    }
    private static String reverse(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
