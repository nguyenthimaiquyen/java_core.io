package day03;
/*Bài 3: Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
        Chuỗi đã cho là: test string
        ký tự xuất hiện nhiều nhất trong chuỗi là: t*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BaiTapTrenLop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
        String str = sc.nextLine();
        Map<Character, Integer> mostChars = timKiTuNhieuNhat(str);
        System.out.println("Kí tự xuất hiện nhiều nhất là: ");
        for (Map.Entry<Character, Integer> entry : mostChars.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " lần");
        }
    }
    private static Map<Character, Integer> timKiTuNhieuNhat(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        //đếm số lần xuất hiện của từng kí tự
        int length = str.length();
        int maxCount = 0;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                int count = charMap.getOrDefault(c,0) + 1;
    //getOrDefault trả về giá trị của cặp phần tử nếu chúng tồn tại, nếu ko tồn tại trả về giá trị mặc định
                charMap.put(c, count);
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        //tìm kí tự xuất hiện nhiều nhất
        Map<Character, Integer>  mostChars = new HashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count == maxCount) {
                mostChars.put(c, count);
            }
        }
        return mostChars;
    }
}
