/*Bài 1: Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
        Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính (name, nữ, khác), địa chỉ.
        Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
        Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
        Các nhân viên có thuộc tính riêng: công việc.
        Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.
        Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
        Thêm mới cán bộ, Tìm kiếm theo họ tên, Hiện thị thông tin về danh sách các cán bộ.
        Thoát khỏi chương trình.*/
package day07_OOP.assignment01;

import java.util.ArrayList;
import java.util.Scanner;
public class QLCB {
    private ArrayList<CanBo> danhSach;
    public QLCB() {
        danhSach = new ArrayList();
    }
    //thêm cán bộ vào danh sách
    public void themCanBo(CanBo canBo) {
        this.danhSach.add(canBo);
    }
    //tìm kiếm các cán bộ theo họ tên
    public void searchCanBo(String name) {
        for (CanBo canBo : danhSach) {
            if (canBo.getName().indexOf(name) >= 0) {
                System.out.println(canBo);
            }
        }
    }
    //hiển thị danh sách cán bộ
    public void showAllCanBo() {
        for (CanBo canBo : danhSach) {
            System.out.println(canBo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB ql = new QLCB();
        int luaChon = 0;

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn menu: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    String luaChon2 = "a";
                    do {
                        System.out.println("a. Thêm công nhân");
                        System.out.println("b. Thêm kỹ sư");
                        System.out.println("c. Thêm nhân viên");
                        System.out.println("d. Nhấn bất kỳ để quay lại");
                        luaChon2 = sc.nextLine();

                        switch (luaChon2) {
                            case "a":
                                System.out.print("Nhập tên công nhân: "); String name1 = sc.nextLine();
                                System.out.print("Nhập tuổi: "); int age1 = sc.nextInt(); sc.nextLine();
                                System.out.print("Nhập giới tính: "); String gender1 = sc.nextLine();
                                System.out.print("Nhập địa chỉ: "); String address1 = sc.nextLine();
                                System.out.print("Nhập bậc của công nhân: "); int level1 = sc.nextInt(); sc.nextLine();

                                CanBo congNhan = new CongNhan(name1, age1, gender1, address1, level1);
                                ql.themCanBo(congNhan);
                                break;
                            case "b":
                                System.out.print("Nhập tên kỹ sư: "); String name2 = sc.nextLine();
                                System.out.print("Nhập tuổi: "); int age2 = sc.nextInt(); sc.nextLine();
                                System.out.print("Nhập giới tính: "); String gender2 = sc.nextLine();
                                System.out.print("Nhập địa chỉ: "); String address2 = sc.nextLine();
                                System.out.print("Nhập ngành đào tạo của kỹ sư: "); String major2 = sc.nextLine();

                                CanBo kySu = new KySu(name2, age2, gender2, address2, major2);
                                ql.themCanBo(kySu);
                                break;
                            case "c":
                                System.out.print("Nhập tên nhân viên: "); String name3 = sc.nextLine();
                                System.out.print("Nhập tuổi: "); int age3 = sc.nextInt(); sc.nextLine();
                                System.out.print("Nhập giới tính: "); String gender3 = sc.nextLine();
                                System.out.print("Nhập địa chỉ: "); String address3 = sc.nextLine();
                                System.out.print("Nhập công việc của nhân viên: "); String job3 = sc.nextLine();

                                CanBo nhanVien = new NhanVien(name3, age3, gender3, address3, job3);
                                ql.themCanBo(nhanVien);
                                break;
                        }
                    } while (luaChon2.equals("a") || luaChon2.equals("b") || luaChon2.equals("c"));
                    break;

                case 2:
                    System.out.print("Tên cán bộ cần tìm: "); String searchName = sc.nextLine();
                    ql.searchCanBo(searchName);
                    break;
                case 3:
                    System.out.println("Danh sách cán bộ: ");
                    ql.showAllCanBo();
                    break;
                default:
                    System.out.println("Lựa chọn chưa chính xác hoặc thoát chương trình!");
            }
        } while (luaChon != 0);

    }
}
