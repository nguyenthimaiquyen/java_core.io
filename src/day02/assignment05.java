package day02;
/*Bài 5:  a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và
        cuối cùng của ký tự đó trong chuỗi vừa nhập.
        b. Nhập 3 xâu ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
        bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =
        “123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”*/
import java.util.Scanner;
public class assignment05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập vào 1 ký tự: ");
        String cha = sc.next();
        //câu a
        System.out.println("Vị trí xuất hiện đầu tiên của \""+ cha +"\" trong chuỗi là: "+ str.indexOf(cha));
        System.out.println("Vị trí xuất hiện cuối cùng của \""+ cha +"\" trong chuỗi là: "+ str.lastIndexOf(cha));
        //câu b
        sc.nextLine(); //bỏ qua dòng trống
        System.out.println("Nhập xâu ký tự s: "); String s = sc.nextLine();
        System.out.println("Nhập xâu ký tự s1: "); String s1 = sc.nextLine();
        System.out.println("Nhập xâu ký tự s2: "); String s2 = sc.nextLine();
        int count = 0;
        String s3 = "";
        for (int i = 0; i <= (s.length() - s1.length()); i++) {
            if (s1.equals(s.substring(i, (s1.length()+i)))) {
                count += 1;
                s3 = s.replace(s1, s2);
            }
        }
        System.out.println("Số lần xuất hiện của chuỗi \""+s1+"\" trong \""+s+"\" là: "+ count);
        System.out.println("thay thế chuỗi \""+s1+ "\" bằng chuỗi \""+s2+ "\" trong chuỗi nguồn được: " +s3);
    }
}
