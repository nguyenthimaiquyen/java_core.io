package day07_OOP.assignment02;

import java.util.ArrayList;

public class DanhSachTheMuon {
    private ArrayList<TheMuon> danhSach;

    public DanhSachTheMuon() {
        this.danhSach = new ArrayList();
    }

    public DanhSachTheMuon(ArrayList<TheMuon> danhSach) {
        this.danhSach = danhSach;
    }

    //thêm thẻ mượn vào danh sách
    public void themTheMuon(TheMuon theMuon) {
        this.danhSach.add(theMuon);
        System.out.println("Thẻ mượn đã được thêm!");
    }
    //xóa thẻ mượn
    public boolean xoaTheMuon(TheMuon theMuon) {
        return this.danhSach.remove(theMuon);
    }
    //hiển thị thông tin các thẻ mượn
    public void showAllTheMuon() {
        for (TheMuon theMuon : danhSach) {
            System.out.println(theMuon);
        }
    }

}
