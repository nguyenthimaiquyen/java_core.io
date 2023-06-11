/*Bài 9: Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).*/
package day05;

public class homework09 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số nguyên có 7 đến 9 chữ số là số thuận nghịch: ");
        for (int i = 100000; i <= 999999; i++) {
            if (laSoThuanNghich(i) && tongChiaHetCho10(i)) {
                System.out.print(i + "\t");
            }
        }
    }
    private static boolean laSoThuanNghich(int n) {
        int m = n;
        String d = "";
        while (n != 0){
            d += n % 10;
            n /= 10;
        }
        if (m == Integer.valueOf(d)) {
            return true;
        }
        return false;
    }
    private static boolean tongChiaHetCho10(int i) {
        int d = 0;
        while (i != 0) {
            d += i % 10;
            i /= 10;
        }
        if (d % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
