package day08_OOP.main;
import day08_OOP.entity.BanDoc;
import day08_OOP.entity.Sach;
import java.util.Scanner;

public class main {
    private static Sach[] mangSach = new Sach[100];
    private static BanDoc[] mangBanDoc = new BanDoc[100];
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        while (true) {
            inNoiDungMenu();
            int luaChon = hamLuaChon();
            switch (luaChon) {
                case 1:
                    nhapSachMoi();
                    break;
                case 2:
                    inSach();
                    break;
                case 3:
                    nhapBanDocMoi();
                    break;
                case 4:
                    inBanDoc();
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;

            }
        }
    }

    public static void inBanDoc() {
        for (int i = 0; i < mangBanDoc.length; i++) {
            if (mangBanDoc[i] != null) {
                System.out.println(mangBanDoc[i]);
            }
        }
    }

    public static void nhapBanDocMoi() {
        System.out.print("Bạn muốn nhập bao nhiêu bạn đọc mới: ");
        int banDoc = new Scanner(System.in).nextInt();
        for (int i = 0; i < banDoc; i++) {
            System.out.println("Nhập thông tin bạn đọc mới thứ "+ (i + 1));
            BanDoc banDocMoi = new BanDoc();
            banDocMoi.nhapThongtin();
            luuBanDoc(banDocMoi);
        }
    }

    public static void luuBanDoc(BanDoc banDocMoi) {
        for (int j = 0; j < mangBanDoc.length; j++) {
            if (mangBanDoc[j] == null) {
                mangBanDoc[j] = banDocMoi;
                break;
            }
        }
    }


    public static int hamLuaChon() {
        int luaChon;
        do {
            luaChon = new Scanner(System.in).nextInt();
            if (luaChon >= 1 && luaChon <= 8) {
                break;
            }
            System.out.println("Nhập sai chức năng, mời bạn nhập lại!");
        } while (true);
        return luaChon;
    }

    public static void inNoiDungMenu() {
        System.out.println("=====================MENU QUẢN LÝ MƯỢN SÁCH=========================");
        System.out.println("1. Nhập danh sách đầu sách mới");
        System.out.println("2. In ra danh sách các đầu sách đã có");
        System.out.println("3. Nhập danh sách bạn đọc mới");
        System.out.println("4. In ra danh sách bạn đọc đã có");
        System.out.println("5. Lập bảng quản lý mượn sách cho từng bạn đọc");
        System.out.println("6. Sắp xếp danh sách quản lý mượn sách");
        System.out.println("7. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc");
        System.out.println("8. Thoát chương trình.");
        System.out.print("Mời bạn chọn: ");
    }

    public static void nhapSachMoi() {
        System.out.print("Bạn muốn nhập bao nhiêu đầu sách mới: ");
        int sachMoi = new Scanner(System.in).nextInt();
        for (int i = 0; i < sachMoi; i++) {
            System.out.println("Nhập thông tin đầu sách thứ "+ (i + 1));
            Sach sach = new Sach();
            sach.nhapThongtin();
            luuSach(sach);
        }
    }

    private static void luuSach(Sach sach) {
        for (int j = 0; j < mangSach.length; j++) {
            if (mangSach[j] == null) {
                mangSach[j] = sach;
                break;
            }
        }
    }

    public static void inSach() {
        for (int i = 0; i < mangSach.length; i++) {
            if (mangSach[i] != null) {
                System.out.println(mangSach[i]);
            }
        }
    }
}
