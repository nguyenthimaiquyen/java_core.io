/* Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
        a) Là số thuận nghịch.
        b) Chỉ có chữ số 0, 6, 8
        c) Tổng chữ số chia hết cho 10 */
package day05;
public class homework01 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số nguyên có 7 đến 9 chữ số là số thuận nghịch: ");
        for (int i = 1000000; i <= 999999999; i++) {
            if (laSoThuanNghich(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("Danh sách các số nguyên có 7 đến 9 chữ số chỉ có chữ số 0,6,8: ");
        for (int i = 1000000; i <= 999999999; i++) {
            if (gomCacChuSo068(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("Danh sách các số nguyên có 7 đến 9 chữ số và tổng các chữ số chia hết cho 10: ");
        for (int i = 1000000; i <= 999999999; i++) {
            if (tongChuSoChiaHetCho10(i)) {
                System.out.print(i + "\t");
            }
        }
    }
    //câu a: là số thuận nghịch
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
    //câu b: chỉ có chữ số 0, 6, 8
    private static boolean gomCacChuSo068(int i) {
        String str = String.valueOf(i);
        for (char index: str.toCharArray()) {
            if (index != '0' && index != '6' && index != '8') {
                return false;
            }
        }
        return true;
    }
    //câu c: tổng các chữ số chia hết cho 10
    private static boolean tongChuSoChiaHetCho10(int i) {
        int d = 0;
        while (i != 0){
            d += i % 10;
            i /= 10;
        }
        if (d % 10 == 0) {
            return true;
        }
        return false;
    }
}
