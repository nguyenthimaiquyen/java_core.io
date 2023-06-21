package day10_OOP.entity;

import java.util.Arrays;

public class Payroll {
    private Reporter reporter;
    private PayrollDetail[] details;

    public Payroll(Reporter reporter, PayrollDetail[] details) {
        this.reporter = reporter;
        this.details = details;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public PayrollDetail[] getDetails() {
        return details;
    }

    public void setDetails(PayrollDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "reporter=" + reporter +
                ", Details=" + Arrays.toString(details) +
                '}';
    }
}
