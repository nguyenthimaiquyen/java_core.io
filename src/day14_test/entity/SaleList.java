package day14_test.entity;

import java.util.Arrays;

public class SaleList {
    private Employee employee;
    private SaleListDetail[] details;

    public SaleList(Employee employee, SaleListDetail[] details) {
        this.employee = employee;
        this.details = details;
    }

    public SaleList() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public SaleListDetail[] getDetails() {
        return details;
    }

    public void setDetails(SaleListDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "SaleList{" +
                "employee=" + employee +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
