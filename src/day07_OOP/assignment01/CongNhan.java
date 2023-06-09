/*Bài 1: Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
        Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
        Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
        Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
        Các nhân viên có thuộc tính riêng: công việc.
        Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.
        Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
        Thêm mới cán bộ, Tìm kiếm theo họ tên, Hiện thị thông tin về danh sách các cán bộ.
        Thoát khỏi chương trình.*/
package day07_OOP.assignment01;
public class CongNhan extends CanBo {
    private int level;
    public CongNhan(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Cong nhan{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
