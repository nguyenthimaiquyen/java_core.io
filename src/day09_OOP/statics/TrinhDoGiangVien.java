package day09_OOP.statics;

public enum TrinhDoGiangVien {
    GS_TS("Giáo sư - Tiến sỹ"),
    PGS_TS("Phó Giáo sư - Tiến sỹ"),
    GiangVienChinh("Giảng viên chính"),
    ThacSy("Thạc Sỹ");
    public String name;

    TrinhDoGiangVien(String name) {
        this.name = name;
    }
}
