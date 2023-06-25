package day13_OOP.entity;

public class InvoiceDetail {
    private Service service;
    private int serviceInvoice;

    public InvoiceDetail(Service service, int serviceInvoice) {
        this.service = service;
        this.serviceInvoice = serviceInvoice;
    }

    public InvoiceDetail() {
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getServiceInvoice() {
        return serviceInvoice;
    }

    public void setServiceInvoice(int serviceInvoice) {
        this.serviceInvoice = serviceInvoice;
    }

    @Override
    public String toString() {
        return "InvoiceDetail{" +
                "services=" + service +
                ", serviceNumber=" + serviceInvoice +
                "}\n";
    }
}
