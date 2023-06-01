package day02;
/*Viết chương trình Java để tạo một chuỗi mới lặp lại mỗi ký tự hai lần từ một chuỗi đã cho
        Chuỗi đã cho là: welcome
        Chuỗi mới là: wweellccoommee */
public class baitaptrenlop01 {
    public static void main(String[] args) {
        String s1 = "welcome";
        String cha[] = s1.split("");

        for (String i: cha) {
            System.out.println(i + i);
        }
    }
}
