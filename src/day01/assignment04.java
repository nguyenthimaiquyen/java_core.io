package day01;

//Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.
public class assignment04 {
    public static void main(String[] args) {
        int x = 54;
        double sqrt = Math.sqrt(x);
        System.out.println("Căn bậc 2 của " + x + " là: " + Math.ceil(sqrt * 1000) / 1000);
    }
}
