package day15_Collection.Entity;

import java.util.ArrayList;
import java.util.List;

public class Timesheet {
    private Worker worker;
    private List<TimesheetDetail> timesheetDetail = new ArrayList<>();

    public Timesheet(Worker worker, List<TimesheetDetail> timesheetDetail) {
        this.worker = worker;
        this.timesheetDetail = timesheetDetail;
    }

    public Timesheet() {
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public List<TimesheetDetail> getTimesheetDetail() {
        return timesheetDetail;
    }

    public void setTimesheetDetail(List<TimesheetDetail> timesheetDetail) {
        this.timesheetDetail = timesheetDetail;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "worker=" + worker +
                ", timesheetsDetail=" + timesheetDetail +
                '}';
    }




}
