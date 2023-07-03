package day15_Collection.Entity;

import day15_Collection.Exception.CheckNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Khai báo lớp Công nhân (mã công nhân, Họ tên, Địa chỉ, Số ĐT, Bậc thợ)
– trong đó Bậc thợ là một số nguyên từ 1 đến 7. Mã công nhân là một số nguyên có 4 chữ số, tự động tăng.*/
public class Worker extends Person {
    private static int AUTO_IdWorker = 1000;
    private int IdWorker;
    private int rank;

    public Worker(String name, String address, String phone, int idWorker, int rank) {
        super(name, address, phone);
        this.IdWorker = idWorker;
        this.rank = rank;
    }

    public Worker() {
        this.IdWorker = AUTO_IdWorker;
        AUTO_IdWorker++;
    }

    public int getIdWorker() {
        return IdWorker;
    }

    public void setIdWorker(int idWorker) {
        IdWorker = idWorker;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "IdWorker=" + IdWorker +
                ", rank=" + rank +
                "} " + super.toString();
    }

    public void inputInfoWorker() {
        super.inputInfo();
        System.out.print("Nhập bậc thợ của công nhân: ");
        int workerRank;
        do {
            try {
                workerRank = new Scanner(System.in).nextInt();
                if (workerRank < 1 || workerRank > 7) {
                    throw new CheckNumberException();
                }
                break;
            } catch ( InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e) {
                System.out.print("Vui lòng nhập Bậc thợ là một số nguyên từ 1 đến 7: ");
            }
        } while (true);
        this.setRank(workerRank);
    }
}
