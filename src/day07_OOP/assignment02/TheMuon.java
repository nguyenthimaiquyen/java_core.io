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
import java.util.Objects;
import java.util.Scanner;
public class TheMuon {
    private int maPhieuMuon;
    private int ngayMuon;
    private int ngayTra;
    private String soHieuSach;
    public SinhVien sinhVien;

    public TheMuon(int maPhieuMuon, int ngayMuon, int ngayTra, String soHieuSach, SinhVien sinhVien) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public TheMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "The muon {" +
                "ma phieu muon= " + maPhieuMuon +
                ", ngay muon= " + ngayMuon +
                ", ngay tra= " + ngayTra +
                ", so hieu sach= '" + soHieuSach + '\'' +
                ", ho ten= '" +  sinhVien.getHoTen() + '\'' +
                ", tuoi= " + sinhVien.getTuoi() +
                ", lop= '" + sinhVien.getLop() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheMuon theMuon = (TheMuon) o;
        return maPhieuMuon == theMuon.maPhieuMuon;
    }
}
