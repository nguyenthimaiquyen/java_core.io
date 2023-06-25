package day13_OOP.statics;

public enum CustomerType {
    CA_NHAN("Cá nhân"),
    DAI_DIEN_DON_VI_HANH_CHINH("Đại diện đơn vị hành chính"),
    DAI_DIEN_DON_VI_KINH_DOANH("Đại diện đơn vị kinh doanh");
    private String name;

    CustomerType(String name) {
        this.name = name;
    }
}
