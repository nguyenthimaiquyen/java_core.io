package day15_Collection.LogicManagement;

import day15_Collection.Entity.Factory;
import day15_Collection.Entity.Timesheet;
import day15_Collection.Entity.TimesheetDetail;
import day15_Collection.Entity.Worker;
import day15_Collection.Exception.CheckNumberException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TimesheetLogicManagement {
    private List<Timesheet> timesheets = new ArrayList<>();
    private FactoryLogicManagement factoryLogicManagement;
    private WorkerLogicManagement workerLogicManagement;

    public TimesheetLogicManagement(FactoryLogicManagement factoryLogicManagement, WorkerLogicManagement workerLogicManagement) {
        this.factoryLogicManagement = factoryLogicManagement;
        this.workerLogicManagement = workerLogicManagement;
    }

    public void inputTimesheet() {
        if (factoryLogicManagement.factoryIsEmpty() || workerLogicManagement.workerIsEmpty()) {
            System.out.println("Chưa có dữ liệu công nhân và xưởng sản xuất, vui lòng nhập dữ liệu trước khi lập bảng chấm công!");
            return;
        }

        System.out.print("Bạn muốn lập bảng danh sách chấm công cho bao nhiêu công nhân: ");
        int workerNumber = workerLogicManagement.inputNumber();
        for (int i = 0; i < workerNumber; i++) {
            //nhập ID công nhân và check ID đó
            System.out.print("Nhập ID công nhân thứ "+ (i+1) + " bạn muốn lập bảng chấm công: ");
            int IdWorker;
            Worker worker = null;
            do {
                try {
                    IdWorker = new Scanner(System.in).nextInt();
                    if (IdWorker < 1000) {
                        throw new CheckNumberException();
                    }
                    for (int j = 0; j < workerLogicManagement.getWorkers().size(); j++) {
                        if(workerLogicManagement.getWorkers().get(j).getIdWorker() == IdWorker) {
                            worker = workerLogicManagement.getWorkers().get(j);
                            break;
                        }
                    }
                    if (worker != null) {
                        break;
                    } else {
                        System.out.println("Không tồn tại mã công nhân bạn vừa nhập, vui lòng nhập lại!");
                    }
                } catch ( InputMismatchException e) {
                    System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                } catch (CheckNumberException e) {
                    System.out.print("Vui lòng nhập ID công nhân >= 1000: ");
                }
            } while (true);
            //nhập số lượng xưởng sản xuất mà công nhân đã làm việc
            System.out.print("Công nhân thứ "+ (i+1) + " đã làm việc tại bao nhiêu xưởng sản xuất: ");
            int factoryNumber;
            do {
                try {
                    factoryNumber = new Scanner(System.in).nextInt();
                    if (factoryNumber < 1 || factoryNumber > factoryLogicManagement.getFactories().size()) {
                        throw new CheckNumberException();
                    }
                    break;
                } catch ( InputMismatchException e) {
                    System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                } catch (CheckNumberException e) {
                    System.out.print("Vui lòng nhập số lượng xưởng sản xuất >= 1 và <= số lượng xưởng sản xuất hiện có: ");
                }
            } while (true);
            List<TimesheetDetail> details = new ArrayList<>();
            //Nhập ID xưởng và check ID đó
            int workingDaySum = 0;
            do {
                for (int j = 0; j < factoryNumber; j++) {
                    System.out.print("Nhập mã xưởng sản xuất thứ " + (j+1) + " mà công nhân thứ " + (i+1) + " đã làm việc: ");
                    int IdFactory;
                    Factory factory = null;
                    do {
                        try {
                            IdFactory = new Scanner(System.in).nextInt();
                            if (IdFactory < 100) {
                                throw new CheckNumberException();
                            }
                            for (int k = 0; k < factoryLogicManagement.getFactories().size(); k++) {
                                if(factoryLogicManagement.getFactories().get(k).getIdFactory() == IdFactory) {
                                    factory = factoryLogicManagement.getFactories().get(k);
                                    break;
                                }
                            }
                            if (factory != null) {
                                break;
                            } else {
                                System.out.println("Không tồn tại mã xưởng bạn vừa nhập, vui lòng nhập lại!");
                            }
                        } catch ( InputMismatchException e) {
                            System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                        } catch (CheckNumberException e) {
                            System.out.print("Vui lòng nhập mã xưởng sản xuất >= 100: ");
                        }
                    } while (true);
                    System.out.print("Nhập số ngày công của công nhân thứ "+ (i+1) + " tại xưởng sản xuất thứ "+ (j+1) + ": ");
                    int workingDay;
                    do {
                        try {
                            workingDay = new Scanner(System.in).nextInt();
                            if (workingDay > 30) {
                                throw new CheckNumberException();
                            }
                            break;
                        } catch ( InputMismatchException e) {
                            System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                        } catch (CheckNumberException e) {
                            System.out.print("Vui lòng nhập tổng số ngày làm việc không vượt quá 30: ");
                        }
                    } while (true);
                    TimesheetDetail timesheetDetail = new TimesheetDetail(factory, workingDay);
                    details.add(timesheetDetail);
                }
                Timesheet timesheet = new Timesheet(worker, details);
                timesheets.add(timesheet);
                try {
                    for (int j = 0; j < factoryNumber; j++){
                        workingDaySum += timesheets.get(i).getTimesheetDetail().get(j).getWorkingDay();
                    }
                    if ( workingDaySum > 30) {
                        throw new CheckNumberException();
                    }
                    break;
                } catch (CheckNumberException e) {
                    System.out.println("Bạn đã nhập tổng số ngày làm việc trong tháng > 30, vui lòng nhập lại!");
                }
            } while (true);
        }
    }

    public void showTimesheet() {
        System.out.println(timesheets);
    }

    public void sortByFactory() {
        if (factoryLogicManagement.getFactories().isEmpty()) {
            System.out.println("Chưa có dữ liệu xưởng sản xuất, vui lòng nhập dữ liệu trước khi sắp xếp!");
            return;
        }

        for (int i = 0; i < timesheets.size(); i++) {
            for (int j = i + 1; j < timesheets.size() - 1; j++) {
                if (factoryLogicManagement.getFactories().get(i).getFactoryName().compareToIgnoreCase(factoryLogicManagement.getFactories().get(i).getFactoryName()) > 0){
                    Timesheet temp = timesheets.get(i);
                    timesheets.set(i, timesheets.get(j));
                    timesheets.set(j, temp);
                }
            }
        }
        System.out.println(timesheets);
    }

    public void sortByWorkerName() {
        if (workerLogicManagement.getWorkers().isEmpty()) {
            System.out.println("Chưa có dữ liệu công nhân, vui lòng nhập dữ liệu trước khi sắp xếp!");
            return;
        }

        for (int i = 0; i < timesheets.size(); i++) {
            for (int j = i + 1; j < timesheets.size() - 1; j++) {
                if (workerLogicManagement.getWorkers().get(i).getName().compareToIgnoreCase(workerLogicManagement.getWorkers().get(j).getName()) > 0){
                    Timesheet temp = timesheets.get(i);
                    timesheets.set(i, timesheets.get(j));
                    timesheets.set(j, temp);
                }
            }
        }
        System.out.println(timesheets);
    }
    /*Thu nhập = 450000 * Bậc lương * Hệ số công việc * (số ngày làm việc/22)*/
    public void calculateSalary() {
        if (timesheets.isEmpty()) {
            System.out.println("Chưa có dữ liệu công nhân, vui lòng nhập dữ liệu trước khi sắp xếp!");
            return;
        }

        for (int i = 0; i < timesheets.size(); i++){
            Timesheet timesheet = timesheets.get(i);
            Worker worker = timesheet.getWorker();
            List<TimesheetDetail> timesheetsDetail = timesheet.getTimesheetDetail();
            float salary = 0;
            for (int j = 0; j < timesheetsDetail.size(); j++){
                salary += 450 * worker.getRank() * timesheetsDetail.get(j).getFactory().getWorkFactor() * timesheetsDetail.get(j).getWorkingDay() / 22;
            }
            System.out.println("Thu nhập của công nhân "+ worker.getName() + " trong 1 tháng là: " + salary);
        }
    }
}
