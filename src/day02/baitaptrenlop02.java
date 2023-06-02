package day02;
/*Viết một chương trình Java để loại bỏ các ký tự trùng lặp trong 1 chuỗi
        Chuỗi đã cho là: techmaster. Sau khi loại bỏ các ký tự trùng lặp, chuỗi mới là: techmasr */
import java.util.LinkedHashSet;
import java.util.Set;
public class baitaptrenlop02 {
    public static void main(String[] args) {
        String s1 = "techmaster";
        String result = removeDuplicate(s1);
        System.out.println("Chuỗi sau khi loại bỏ các kí tự trùng lặp: " + result);
    }
    public static String removeDuplicate(String s1) {
        Set<Character> str = new LinkedHashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            str.add(s1.charAt(i));
        }
        StringBuilder newStr = new StringBuilder();
        for (char i: str ) {
            newStr.append(i);
        }
        return newStr.toString();
    }
}
