package day09_OOP.entity;

import day09_OOP.statics.TrinhDoGiangVien;
import java.util.Scanner;

public class GiangVien extends Nguoi {
    private static int AUTO_MAGIANGVIEN = 100;
    private int maGiangVien;
    private TrinhDoGiangVien trinhDoGiangVien;

    public GiangVien(String hoTen, String diaChi, String soDienThoai, int maGiangVien, TrinhDoGiangVien trinhDoGiangVien) {
        super(hoTen, diaChi, soDienThoai);
        this.maGiangVien = maGiangVien;
        this.trinhDoGiangVien = trinhDoGiangVien;
    }

    public GiangVien() {
        this.maGiangVien = AUTO_MAGIANGVIEN;
        AUTO_MAGIANGVIEN++;
    }

    public static int getAutoMagiangvien() {
        return AUTO_MAGIANGVIEN;
    }

    public static void setAutoMagiangvien(int autoMagiangvien) {
        AUTO_MAGIANGVIEN = autoMagiangvien;
    }

    public int getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(int maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public TrinhDoGiangVien getTrinhDoGiangVien() {
        return trinhDoGiangVien;
    }

    public void setTrinhDoGiangVien(TrinhDoGiangVien trinhDoGiangVien) {
        this.trinhDoGiangVien = trinhDoGiangVien;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "maGiangVien=" + maGiangVien +
                ", trinhDoGiangVien=" + trinhDoGiangVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    public void nhapThongtin() {
        System.out.print("Nhập họ tên: ");
        super.setHoTen(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ: ");
        super.setDiaChi(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại: ");
        super.setSoDienThoai(new Scanner(System.in).nextLine());
        System.out.println("Nhập trình độ giảng viên: ");
        System.out.println("1. GS-TS ");
        System.out.println("2. PGS-TS ");
        System.out.println("3. Giảng viên chính");
        System.out.println("4. Thạc sỹ");
        System.out.print("Mời bạn chọn: ");
        int chonLoaiGiangVien;
        do {
            chonLoaiGiangVien = new Scanner(System.in).nextInt();
            if (chonLoaiGiangVien >= 1 && chonLoaiGiangVien <= 4) {
                break;
            }
            System.out.println("Nhập sai chức năng, mời bạn nhập lại!");
        } while (true);
        switch (chonLoaiGiangVien) {
            case 1:
                this.setTrinhDoGiangVien(TrinhDoGiangVien.GS_TS);
                break;
            case 2:
                this.setTrinhDoGiangVien(TrinhDoGiangVien.PGS_TS);
                break;
            case 3:
                this.setTrinhDoGiangVien(TrinhDoGiangVien.GiangVienChinh);
                break;
            case 4:
                this.setTrinhDoGiangVien(TrinhDoGiangVien.ThacSy);
                break;
        }
    }

}
