package day02;
/* Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định (nhập chuỗi),
        tính tuổi của người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng). */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String dateString = sc.nextLine();
        LocalDate birthday = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            birthday = LocalDate.parse(dateString,formatter);
        } catch (Exception e) {
            System.out.println("Lỗi: Không thể phân tích ngày tháng. Vui lòng kiểm tra định dạng đầu vào!");
        }
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthday.getYear();
        System.out.println("Tuổi của người đó là: "+ age);
    }
}
