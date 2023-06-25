package day13_OOP.entity;

import java.util.Arrays;

public class Invoice {
    private Customer customer;
    private InvoiceDetail[] details;

    public Invoice(Customer customer, InvoiceDetail[] details) {
        this.customer = customer;
        this.details = details;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public InvoiceDetail[] getDetails() {
        return details;
    }

    public void setDetails(InvoiceDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer=" + customer +
                ", \n details=" + Arrays.toString(details) +
                '}';
    }
}
