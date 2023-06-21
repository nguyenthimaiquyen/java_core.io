package day09_OOP.entity;

import day08_OOP.statics.ChuyenNganh;

import java.util.Scanner;

public class MonHoc {
    private static int AUTO_MAMONHOC = 100;
    private int maMonHoc;
    private String tenMon;
    private int tongSoTiet;
    private int soTietLyThuyet;
    private double mucKinhPhi;

    public MonHoc(int maMonHoc, String tenMon, int tongSoTiet, int soTietLyThuyet, double mucKinhPhi) {
        this.maMonHoc = maMonHoc;
        this.tenMon = tenMon;
        this.tongSoTiet = tongSoTiet;
        this.soTietLyThuyet = soTietLyThuyet;
        this.mucKinhPhi = mucKinhPhi;
    }

    public MonHoc() {
        this.maMonHoc = AUTO_MAMONHOC;
        AUTO_MAMONHOC++;
    }

    public static int getAutoMamonhoc() {
        return AUTO_MAMONHOC;
    }

    public static void setAutoMamonhoc(int autoMamonhoc) {
        AUTO_MAMONHOC = autoMamonhoc;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    public double getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(double mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMonHoc=" + maMonHoc +
                ", tenMon='" + tenMon + '\'' +
                ", tongSoTiet=" + tongSoTiet +
                ", soTietLyThuyet=" + soTietLyThuyet +
                ", mucKinhPhi=" + mucKinhPhi +
                '}';
    }

    public void nhapThongtin() {
        System.out.print("Nhập tên môn: ");
        this.setTenMon(new Scanner(System.in).nextLine());
        System.out.print("Nhập tổng số tiết: ");
        this.setTongSoTiet(new Scanner(System.in).nextInt());
        System.out.print("Nhập số tiết lý thuyết: ");
        this.setSoTietLyThuyet(new Scanner(System.in).nextInt());
        System.out.print("Nhập mức kinh phí: ");
        this.setMucKinhPhi(new Scanner(System.in).nextInt());
    }


}
