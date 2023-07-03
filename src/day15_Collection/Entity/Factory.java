package day15_Collection.Entity;

import day15_Collection.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factory {
    private static int AUTO_IdFactory = 100;
    private int IdFactory;
    private String factoryName;
    private String description;
    private float workFactor;

    public Factory(int idFactory, String factoryName, String description, float workFactor) {
        this.IdFactory = idFactory;
        this.factoryName = factoryName;
        this.description = description;
        this.workFactor = workFactor;
    }

    public Factory() {
        this.IdFactory = AUTO_IdFactory;
        AUTO_IdFactory++;
    }

    public int getIdFactory() {
        return IdFactory;
    }

    public void setIdFactory(int idFactory) {
        IdFactory = idFactory;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getWorkFactor() {
        return workFactor;
    }

    public void setWorkFactor(float workFactor) {
        this.workFactor = workFactor;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "IdFactory=" + IdFactory +
                ", factoryName='" + factoryName + '\'' +
                ", description='" + description + '\'' +
                ", workFactor=" + workFactor +
                '}';
    }
    /*Khai báo lớp Xưởng sản xuất (mã xưởng, tên xưởng, mô tả, Hệ số công việc),
            mã xưởng là một số nguyên có 3 chữ số, tự động tăng. Hệ số công việc là một số thực trong khoảng từ 1 đến 20,*/

    public void inputFactory() {
        System.out.print("Nhập tên xưởng: ");
        this.setFactoryName(new Scanner(System.in).nextLine());
        System.out.print("Nhập mô tả về xưởng: ");
        this.setDescription(new Scanner(System.in).nextLine());
        System.out.print("Nhập hệ số công việc: ");
        float workFactor;
        do {
            try {
                workFactor = new Scanner(System.in).nextFloat();
                if (workFactor < 1 || workFactor > 20) {
                    throw new CheckNumberException();
                }
                break;
            } catch ( InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e) {
                System.out.print("Vui lòng nhập Hệ số công việc là một số thực trong khoảng từ 1 đến 20: ");
            }
        } while (true);
        this.setWorkFactor(workFactor);
    }
}
