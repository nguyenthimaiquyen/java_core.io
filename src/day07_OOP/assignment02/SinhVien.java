/*Bài 2: Thư viện trung tâm đại học quốc gia có nhu cầu quản lý việc mượn, trả sách.
        Sinh viên đăng ký tham gia mượn sách thông qua thẻ mà thư viện cung cấp.
        Với mỗi thẻ sẽ lưu các thông tin sau: Mã phiếu mượn, ngày mượn, hạn trả,
        số hiệu sách, và các thông tin cá nhân của sinh viên mượn sách.
        Các thông tin của sinh viên mượn sách bao gồm: Họ tên, tuổi, lớp.
        Để đơn giản cho ứng dụng console. Chúng ta mặc định ngày mượn, ngày trả là số nguyên dương.
        Yêu cầu 1: Xây dựng lớp SinhVien để quản lý thông tin của mỗi sinh viên.
        Yêu cầu 2: Xây dựng lớp TheMuon để quản lý việc mượn trả sách của các sinh viên.
        Yêu cầu 3: Xây dựng các phương thức: Thêm, xoá theo mã phiếu mượn và hiển thị thông tin các thẻ mượn.*/
package day07_OOP.assignment02;
public class SinhVien {
    private String hoTen;
    private int tuoi;
    private String lop;

    public SinhVien(String hoTen, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Sinh vien{" +
                "ho ten='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", lop='" + lop + '\'' +
                '}';
    }
}
