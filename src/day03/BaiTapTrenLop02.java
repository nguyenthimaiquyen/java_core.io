package day03;
/*Bài 2: @input: 1 year = 365 * 1 day = 24 hour = 1440 minute = 86400 second
        Viết chương trình Java chuyển đầu vào thành số giờ và số năm:
        a. Đầu vào là số giờ
        b. Đầu vào là số phút.
        c. Đầu vào là số giây.
        VD: nhập đầu vào: 24 giờ, 1440 phút, 86400 giây
        kết quả: 1 ngày, 0 năm*/
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class BaiTapTrenLop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //câu a
        System.out.println("Nhập vào số giờ: ");
        long hours = sc.nextLong();
        long day1 = TimeUnit.HOURS.toDays(hours);
        long year1 = (long) Math.floor((double) day1 / 365);
        System.out.println(hours + " giờ = "+ day1 +" ngày");
        System.out.println(hours + " giờ = "+ year1 +" năm");
        //câu b
        System.out.println("Nhập vào số phút: ");
        long minutes = sc.nextLong();
        long day2 = TimeUnit.MINUTES.toDays(minutes);
        long year2 = (long) Math.floor((double) day2 / 365);
        System.out.println(minutes + " phút = "+ day2 +" ngày");
        System.out.println(minutes + " phút = "+ year2 +" năm");
        //câu c
        System.out.println("Nhập vào số giây: ");
        long second = sc.nextLong();
        long day3 = TimeUnit.SECONDS.toDays(second);
        long year3 = (long) Math.floor((double) day3 / 365);
        System.out.println(second + " giây = "+ day3 +" ngày");
        System.out.println(second + " giây = "+ year3 +" năm");
    }
}
