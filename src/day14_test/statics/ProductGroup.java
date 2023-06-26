package day14_test.statics;
/* trong đó Nhóm hàng có thể là: Điện tử, Điện lạnh, Máy tính, Thiết bị văn phòng.*/
public enum ProductGroup {
    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
    THIET_BI_VAN_PHONG("Thiết bị văn phòng");

    private String name;

    ProductGroup(String name) {
        this.name = name;
    }
}
