package day15_Collection.LogicManagement;

import day15_Collection.Entity.Worker;
import day15_Collection.Exception.CheckNumberException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WorkerLogicManagement {
    private List<Worker> workers = new ArrayList<>();

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public void inputWorker() {
        System.out.print("Bạn muốn nhập bao nhiêu công nhân: ");
        int workerNumber = inputNumber();
        for (int i = 0; i < workerNumber; i++) {
            System.out.println("Nhập thông tin của công nhân thứ " + (i + 1) + ": ");
            Worker worker = new Worker();
            worker.inputInfoWorker();
            workers.add(worker);
        }
    }

    public int inputNumber() {
        int workerNumber;
        do {
            try {
                workerNumber = new Scanner(System.in).nextInt();
                if (workerNumber < 1) {
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e) {
                System.out.print("Vui lòng nhập số lượng công nhân >= 1: ");
            }
        } while (true);
        return workerNumber;
    }

    public void showWorker() {
        System.out.println(workers);
    }

    public boolean workerIsEmpty() {
        return workers.isEmpty();
    }

}
