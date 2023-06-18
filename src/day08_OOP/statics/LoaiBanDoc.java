package day08_OOP.statics;

public enum LoaiBanDoc {
    SINHVIEN("sinh viên"),
    HOCVIENCAOHOC("học viên cao học"),
    GIAOVIEN("giáo viên");

    public String name;

    LoaiBanDoc(String name) {
        this.name = name;
    }
}
