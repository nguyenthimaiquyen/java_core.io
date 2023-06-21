package day10_OOP.statics;

public enum ReporterLevel {
    CHUYEN_NGHIEP("chuyên nghiệp"),
    NGHIEP_DU("nghiệp dư"),
    CONG_TAC_VIEN("cộng tác viên");

    public String name;

    ReporterLevel(String name) {
        this.name = name;
    }
}
