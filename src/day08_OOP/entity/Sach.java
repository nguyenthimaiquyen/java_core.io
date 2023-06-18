package day08_OOP.entity;

import day08_OOP.statics.ChuyenNganh;

import java.util.Scanner;

public class Sach implements nhapThongTin {
    private static int AUTO_MASACH = 10000;
    private int maSach;
    private String tenSach;
    private String tacGia;
    private ChuyenNganh chuyenNganh;
    private int namXuatBan;

    public Sach() {
        this.maSach = AUTO_MASACH;
        AUTO_MASACH++;
    }

    public Sach(int maSach, String tenSach, String tacGia, ChuyenNganh chuyenNganh, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.namXuatBan = namXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Sach {" +
                "maSach = " + maSach +
                ", tenSach = '" + tenSach + '\'' +
                ", tacGia = '" + tacGia + '\'' +
                ", chuyenNganh = '" + chuyenNganh + '\'' +
                ", namXuatBan = " + namXuatBan +
                '}';
    }
    @Override
    public void nhapThongtin() {
        System.out.print("Nhập tên sách: ");
        this.setTenSach(new Scanner(System.in).nextLine());
        System.out.print("Nhập tác giả: ");
        this.setTacGia(new Scanner(System.in).nextLine());

        System.out.println("Nhập chuyên ngành: ");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học – Nghệ thuật");
        System.out.println("3. Điện tử Viễn thông");
        System.out.println("4. Công nghệ thông tin");
        System.out.print("Mời bạn chọn: ");
        int chonChuyenNganh;
        do {
            chonChuyenNganh = new Scanner(System.in).nextInt();
            if (chonChuyenNganh >= 1 && chonChuyenNganh <= 4) {
                break;
            }
            System.out.println("Nhập sai chức năng, mời bạn nhập lại!");
        } while (true);
        switch (chonChuyenNganh) {
            case 1:
                this.setChuyenNganh(ChuyenNganh.KHTN);
                break;
            case 2:
                this.setChuyenNganh(ChuyenNganh.VHNT);
                break;
            case 3:
                this.setChuyenNganh(ChuyenNganh.DTVT);
                break;
            case 4:
                this.setChuyenNganh(ChuyenNganh.CNTT);
                break;
        }
        System.out.print("Nhập năm xuất bản: ");
        this.setNamXuatBan(new Scanner(System.in).nextInt());
    }
}
