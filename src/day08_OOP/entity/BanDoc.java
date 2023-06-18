package day08_OOP.entity;

import day08_OOP.statics.ChuyenNganh;
import day08_OOP.statics.LoaiBanDoc;

import java.util.Scanner;

public class BanDoc extends Nguoi implements nhapThongTin {
    private static int AUTO_MABANDOC = 10000;
    private int maBanDoc;
    private LoaiBanDoc loaiBanDoc;

    public BanDoc(String hoTen, String diaChi, String soDienThoai, int maBanDoc, LoaiBanDoc loaiBanDoc) {
        super(hoTen, diaChi, soDienThoai);
        this.maBanDoc = maBanDoc;
        this.loaiBanDoc = loaiBanDoc;
    }

    public BanDoc() {
        this.maBanDoc = AUTO_MABANDOC;
        AUTO_MABANDOC++;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

    public LoaiBanDoc getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(LoaiBanDoc loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", soDienThoai='" + super.getSoDienThoai() + '\'' +
                ", maBanDoc=" + maBanDoc +
                ", loaiBanDoc='" + loaiBanDoc + '\'' +
                '}';
    }

    @Override
    public void nhapThongtin() {
        System.out.print("Nhập họ tên bạn đọc: ");
        super.setHoTen(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ của bạn đọc: ");
        super.setDiaChi(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại của bạn đọc: ");
        super.setSoDienThoai(new Scanner(System.in).nextLine());
        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giáo viên");
        System.out.print("Mời bạn chọn: ");
        int chonLoaiBanDoc;
        do {
            chonLoaiBanDoc = new Scanner(System.in).nextInt();
            if (chonLoaiBanDoc >= 1 && chonLoaiBanDoc <= 3) {
                break;
            }
            System.out.println("Nhập sai chức năng, mời bạn nhập lại!");
        } while (true);
        switch (chonLoaiBanDoc) {
            case 1:
                this.setLoaiBanDoc(LoaiBanDoc.SINHVIEN);
                break;
            case 2:
                this.setLoaiBanDoc(LoaiBanDoc.HOCVIENCAOHOC);
                break;
            case 3:
                this.setLoaiBanDoc(LoaiBanDoc.GIAOVIEN);
                break;
        }
    }


}
