package day08_OOP.statics;

public enum ChuyenNganh {
    KHTN("Khoa học tự nhiên"),
    VHNT("Văn học – Nghệ thuật"),
    DTVT("Điện tử Viễn thông"),
    CNTT("Công nghệ thông tin");

    public String name;

    ChuyenNganh(String name) {
        this.name = name;
    }
}
