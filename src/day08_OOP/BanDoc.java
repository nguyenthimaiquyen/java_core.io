package day08_OOP;
public class BanDoc extends Nguoi{
    private int maBanDoc;
    private String loaiBanDoc;

    public BanDoc(String hoTen, String diaChi, String soDienThoai, int maBanDoc, String loaiBanDoc) {
        super(hoTen, diaChi, soDienThoai);
        this.maBanDoc = maBanDoc;
        this.loaiBanDoc = loaiBanDoc;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

    public String getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    @Override
    public String toString() {
        return "BanDoc {" +
                "hoTen = '" + this.getHoTen() + '\'' +
                ", diaChi = '" + this.getDiaChi() + '\'' +
                ", soDienThoai = '" + this.getSoDienThoai() + '\'' +
                "maBanDoc = " + maBanDoc +
                ", loaiBanDoc = '" + loaiBanDoc + '\'' +
                '}';
    }

    
}
