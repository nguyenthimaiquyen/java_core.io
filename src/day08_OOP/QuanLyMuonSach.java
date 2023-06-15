package day08_OOP;
import java.util.ArrayList;

public class QuanLyMuonSach {
    private ArrayList<Sach> sachList;
    private ArrayList<BanDoc> banDocList;

    public QuanLyMuonSach(ArrayList<Sach> sachList, ArrayList<BanDoc> banDocList) {
        this.sachList = sachList;
        this.banDocList = banDocList;
    }

    public QuanLyMuonSach() {
        this.sachList = new ArrayList();
        this.banDocList = new ArrayList();
    }

    //1. Nhập danh sách đầu sách
    public void addSach(Sach s) {
        this.sachList.add(s);
    }
    //2. in danh sách sách vừa nhập
    public void inSach() {
        for (Sach sach : sachList) {
            System.out.println(sach);
        }
    }
    //3. Nhập danh sách bạn đọc
    public void addBanDoc(BanDoc banDoc) {
        this.banDocList.add(banDoc);
    }
    //4. in danh sách bạn đọc
    public void inBanDocList() {
        for (BanDoc banDoc : banDocList) {
            System.out.println(banDoc);
        }
    }







}
