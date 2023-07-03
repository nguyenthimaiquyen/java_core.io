package day15_Collection.LogicManagement;

import day15_Collection.Entity.Factory;
import day15_Collection.Entity.Worker;
import day15_Collection.Exception.CheckNumberException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FactoryLogicManagement {
    private List<Factory> factories = new ArrayList<>();

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    public void inputFactory() {
        System.out.print("Bạn muốn nhập thông tin bao nhiêu xưởng sản xuất: ");
        int factoryNumber;
        do {
            try {
                factoryNumber = new Scanner(System.in).nextInt();
                if (factoryNumber < 1) {
                    throw new CheckNumberException();
                }
                break;
            } catch ( InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e) {
                System.out.print("Vui lòng nhập số lượng xưởng sản xuất >= 1: ");
            }
        } while (true);
        for (int i = 0; i < factoryNumber; i++){
            System.out.println("Nhập thông tin của xưởng sản xuất thứ "+ (i+1) +": ");
            Factory factory = new Factory();
            factory.inputFactory();
            factories.add(factory);
        }
    }

    public void showFactory() {
        System.out.println(factories);
    }

    public boolean factoryIsEmpty() {
        return factories.isEmpty();
    }


}
