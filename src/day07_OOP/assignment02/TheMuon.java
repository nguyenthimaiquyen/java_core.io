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

import day07_OOP.assignment01.CanBo;
import day07_OOP.assignment01.QLCB;

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
        return "TheMuon{" +
                "maPhieuMuon=" + maPhieuMuon +
                ", ngayMuon=" + ngayMuon +
                ", ngayTra=" + ngayTra +
                ", soHieuSach='" + soHieuSach +
                ", sinhVien=" + sinhVien +
                '}';
    }

    public void themTheMuon(TheMuon theMuon) {

    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TheMuon themMuon = new TheMuon();
        int luaChon = 0;

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Thêm thẻ mượn");
            System.out.println("2. Xóa thẻ mượn");
            System.out.println("3. Hiển thị các thẻ mượn");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn menu: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã phiếu mượn sách: "); int maPhieu = sc.nextInt();
                    System.out.print("Nhập ngày mượn: "); int ngayMuon = sc.nextInt();
                    System.out.print("Nhập ngày trả: "); int ngayTra = sc.nextInt(); sc.nextLine();
                    System.out.print("Nhập số hiệu sách: "); String sohieuSach = sc.nextLine();
                    System.out.print("Nhập tên sinh viên: "); String ten = sc.nextLine();
                    System.out.print("Nhập tuổi sinh viên: "); int tuoi = sc.nextInt(); sc.nextLine();
                    System.out.print("Nhập lớp của sinh viên: "); String lop = sc.nextLine();

                    SinhVien sinhVien1 = new SinhVien(ten, tuoi, lop);
                    TheMuon theMuon1 = new TheMuon(maPhieu, ngayMuon, ngayTra, sohieuSach, sinhVien1);
                    break;
                case 2:


                    break;
                case 3:


                    break;
                default:
                    System.out.println("Lựa chọn chưa chính xác hoặc thoát chương trình!");
            }

        } while (luaChon != 0);
    }
}
