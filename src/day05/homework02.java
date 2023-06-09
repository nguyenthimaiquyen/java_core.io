/*Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
        a) Là số nguyên tố.
        b) Tất cả các chữ số là nguyên tố
        c) Đảo của nó cũng là một số nguyên tố*/
package day05;
public class homework02 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số nguyên có 7 chữ số và là số nguyên tố: ");
        for (int i = 1000000; i <= 9999999; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("Danh sách các số nguyên có 7 chữ số trong đó tất cả các chữ số là số nguyên tố: ");
        for (int i = 1000000; i <= 9999999; i++) {
            if (tatCaLaSoNguyenTo(i)) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("Danh sách các số nguyên có 7 chữ số mà đảo của nó là một số nguyên tố: ");
        for (int i = 1000000; i <= 9999999; i++) {
            if (daoLaSoNguyenTo(i)) {
                System.out.print(i + "\t");
            }
        }
    }
    //câu a: là số nguyên tố
    private static boolean laSoNguyenTo(int n) {
        int m = (int) Math.sqrt(n);
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //câu b: tất cả các chữ số là số nguyên tố
    private static boolean tatCaLaSoNguyenTo(int n) {
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            if (c != '2' && c != '3' && c != '5' && c != '7') {
                return false;
            }
        }
        return true;
    }
    //câu c: đảo của nó cũng là một số nguyên tố
    private static boolean daoLaSoNguyenTo(int n) {
        String d = "";
        while (n != 0) {
            d += n % 10;
            n /= 10;
        }
        int num = Integer.valueOf(d);
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
