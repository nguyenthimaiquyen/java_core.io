package day07_OOP.assignment02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachTheMuon danhSach = new DanhSachTheMuon();
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
                    danhSach.themTheMuon(theMuon1);
                    break;
                case 2:
                    System.out.print("Nhập mã phiếu mượn sách muốn xóa: "); int maPhieuCanXoa = sc.nextInt();
                    TheMuon theMuon2 = new TheMuon(maPhieuCanXoa);
                    System.out.println("Xóa thẻ mượn trong danh sách: " + danhSach.xoaTheMuon(theMuon2));
                    break;
                case 3:
                    danhSach.showAllTheMuon();
                    break;
                default:
                    System.out.println("Lựa chọn chưa chính xác hoặc thoát chương trình!");
            }

        } while (luaChon != 0);
    }
}
