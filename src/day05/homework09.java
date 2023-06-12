/*Bài 9: Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).*/
package day05;

public class homework09 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số nguyên có 7 đến 9 chữ số là số thuận nghịch: ");
        for (int i = 100000; i <= 999999; i++) {
            if (laSoThuanNghich(i)) {
                System.out.print(i + "\t");
            }
        }
    }
    private static boolean laSoThuanNghich(int n) {
        int m = n;
        String str = "";
        int sum = 0;
        while (n != 0){
            str += n % 10;
            sum += n % 10;
            n /= 10;
        }
        if (m == Integer.valueOf(str) && sum % 10 == 0) {
            return true;
        }
        return false;
    }
}
