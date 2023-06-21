package day09_OOP.main;

import day09_OOP.entity.GiangVien;
import day09_OOP.entity.MonHoc;
import java.util.Scanner;

public class main {
    public static MonHoc[] monHocs = new MonHoc[100];
    public static GiangVien[] giangViens = new GiangVien[100];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            inNoiDungMenu();
            int luaChon = hamLuaChon();
            switch (luaChon) {
                case 1:
                    nhapMonHocMoi();
                    break;
                case 2:
                    inMonHoc();
                    break;
                case 3:
                    nhapGiangVienMoi();
                    break;
                case 4:
                    inGiangVien();
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    return;
            }

        }
    }

    private static void inGiangVien() {
        for (int i = 0; i < giangViens.length; i++) {
            if (giangViens[i] != null) {
                System.out.println(giangViens[i]);
            }
        }
    }

    private static void nhapGiangVienMoi() {
        System.out.print("Bạn muốn nhập bao nhiêu giảng viên mới: ");
        int giangVien = new Scanner(System.in).nextInt();
        for (int i = 0; i < giangVien; i++) {
            System.out.println("Nhập thông tin giảng viên mới thứ "+ (i + 1));
            GiangVien giangVienMoi = new GiangVien();
            giangVienMoi.nhapThongtin();
            luuGiangVien(giangVienMoi);
        }
    }

    private static void luuGiangVien(GiangVien giangVienMoi) {
        for (int j = 0; j < giangViens.length; j++) {
            if (giangViens[j] == null) {
                giangViens[j] = giangVienMoi;
                break;
            }
        }
    }

    private static void inMonHoc() {
        for (int i = 0; i < monHocs.length; i++) {
            if (monHocs[i] != null) {
                System.out.println(monHocs[i]);
            }
        }
    }

    private static void nhapMonHocMoi() {
        System.out.print("Bạn muốn nhập bao nhiêu môn học mới: ");
        int soMonHocMoi = new Scanner(System.in).nextInt();
        for (int i = 0; i < soMonHocMoi; i++) {
            System.out.println("Nhập thông tin môn học thứ "+ (i + 1));
            MonHoc monHoc = new MonHoc();
            monHoc.nhapThongtin();
            luuMonHoc(monHoc);
        }
    }

    public static void luuMonHoc(MonHoc monHoc) {
        for (int j = 0; j < monHocs.length; j++) {
            if (monHocs[j] == null) {
                monHocs[j] = monHoc;
                break;
            }
        }
    }

    public static int hamLuaChon() {
        int luaChon;
        do {
            luaChon = new Scanner(System.in).nextInt();
            if (luaChon >= 1 && luaChon <= 10) {
                break;
            }
            System.out.println("Nhập sai chức năng, mời bạn nhập lại!");
        } while (true);
        return luaChon;
    }

    public static void inNoiDungMenu() {
        System.out.println("=====================MENU QUẢN LÝ KÊ KHAI GIẢNG DẠY=========================");
        System.out.println("1. Nhập danh sách môn học mới");
        System.out.println("2. In ra danh sách các môn học đã có");
        System.out.println("3. Nhập danh sách giảng viên mới");
        System.out.println("4. In ra danh sách giảng viên đã có");
        System.out.println("5. Lập Bảng kê khai giảng cho mỗi giảng viên");
        System.out.println("6. In danh sách Bảng kê khai giảng cho từng giảng viên");
        System.out.println("7. Sắp xếp danh sách kê khai giảng dạy theo họ tên giảng viên");
        System.out.println("8. Sắp xếp danh sách kê khai giảng dạy theo số tiết giảng dạy mỗi môn (giảm dần)");
        System.out.println("9. Tính toán và lập bảng tính tiền công cho mỗi giảng viên");
        System.out.println("10. Thoát chương trình.");
        System.out.print("Mời bạn chọn: ");
    }
}
