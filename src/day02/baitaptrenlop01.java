package day02;

/*Viết chương trình Java để tạo một chuỗi mới lặp lại mỗi ký tự hai lần từ một chuỗi đã cho
        Chuỗi đã cho là: welcome
        Chuỗi mới là: wweellccoommee */
public class baitaptrenlop01 {
    public static void main(String[] args) {
        String s1 = "welcome";
        String s2[] = s1.split("");

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s2[i]);
        }

        for (String i: s2) {
            System.out.print(i + i);
        }
    }
}
