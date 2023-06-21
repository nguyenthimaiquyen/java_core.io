package day10_OOP.entity;

import day10_OOP.statics.ReporterLevel;

import java.util.Scanner;

public class Reporter extends People {
    private static int AUTO_REPORTERID = 10000;
    private int reporterID;
    private ReporterLevel reporterLevel;

    public Reporter(String name, String address, String telephone, int reporterID, ReporterLevel reporterLevel) {
        super(name, address, telephone);
        this.reporterID = reporterID;
        this.reporterLevel = reporterLevel;
    }

    public Reporter() {
        this.reporterID = AUTO_REPORTERID;
        AUTO_REPORTERID++;
    }

    public static int getAutoReporterid() {
        return AUTO_REPORTERID;
    }

    public static void setAutoReporterid(int autoReporterid) {
        AUTO_REPORTERID = autoReporterid;
    }

    public int getReporterID() {
        return reporterID;
    }

    public void setReporterID(int reporterID) {
        this.reporterID = reporterID;
    }

    public ReporterLevel getReporterLevel() {
        return reporterLevel;
    }

    public void setReporterLevel(ReporterLevel reporterLevel) {
        this.reporterLevel = reporterLevel;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", telephone='" + super.getTelephone() + '\'' +
                ", reporterID=" + reporterID +
                ", reporterLevel=" + reporterLevel +
                "} ";
    }

    public void inputReporterInfo() {
        System.out.print("Nhập họ tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại: ");
        this.setTelephone(new Scanner(System.in).nextLine());
        System.out.println("Chọn loại phóng viên: ");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2. Nghiệp dư");
        System.out.println("3. Cộng tác viên");
        int choiceReporterLevel;
        do {
            choiceReporterLevel = new Scanner(System.in).nextInt();
            if (choiceReporterLevel >= 1 && choiceReporterLevel <= 3) {
                break;
            }
            System.out.println("Chọn sai chức năng, vui lòng chọn lại!");
        } while (true);
        switch (choiceReporterLevel) {
            case 1:
                this.setReporterLevel(ReporterLevel.CHUYEN_NGHIEP);
                break;
            case 2:
                this.setReporterLevel(ReporterLevel.NGHIEP_DU);
                break;
            case 3:
                this.setReporterLevel(ReporterLevel.CONG_TAC_VIEN);
                break;
        }
    }
}
