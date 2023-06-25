package day13_OOP.logicHandle;

import day13_OOP.Exception.CheckNumberException;
import day13_OOP.entity.Customer;
import day13_OOP.entity.Invoice;
import day13_OOP.entity.InvoiceDetail;
import day13_OOP.entity.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceLogicManagement {
    private Invoice[] invoices = new Invoice[100];
    private CustomerLogicManagement customerLogicManagement;
    private ServiceLogicManagement serviceLogicManagement;

    public InvoiceLogicManagement(CustomerLogicManagement customerLogicManagement, ServiceLogicManagement serviceLogicManagement) {
        this.customerLogicManagement = customerLogicManagement;
        this.serviceLogicManagement = serviceLogicManagement;
    }


    public void inputInvoice() {
        if (!customerLogicManagement.customerIsNotEmpty() || !serviceLogicManagement.serviceIsNotEmpty()) {
            System.out.println("Không có dữ liệu khách hàng hoặc dịch vụ, vui lòng tạo đủ dữ liệu trước khi lập hóa đơn!");
            return;
        }

        System.out.print("Nhập số khách hàng bạn muốn lập hóa đơn: ");
        int customerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < customerNumber; i++) {
            //Nhập thông tin khách hàng và check xem có tồn tại KH hay không
            System.out.println("Nhập thông tin khách hàng thứ "+ (i+1) + " bạn muốn lập hóa đơn: ");
            System.out.print("Nhập ID khách hàng: ");
            int customerID;
            Customer customer = null;
            do {
                try {
                    customerID = new Scanner(System.in).nextInt();
                    if (customerID < 10000){
                        throw new CheckNumberException();
                    }
                    for (int j = 0; j < customerLogicManagement.getCustomer().length; j++) {
                        if (customerLogicManagement.getCustomer()[j] != null && customerLogicManagement.getCustomer()[j].getIdCustomer() == customerID) {
                            customer = customerLogicManagement.getCustomer()[j];
                            break;
                        }
                    }
                    if (customer != null) {
                        break;
                    }
                    System.out.println("Không tồn tại ID khách hàng vừa nhập, vui lòng nhập lại!");
                } catch (InputMismatchException e) {
                    System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                } catch (CheckNumberException e){
                    System.out.print("Vui lòng nhập mã khách hàng >= 10000: ");
                }
            } while (true);
            //nhập số dịch vụ KH đã sử dụng và try catch số đó
            System.out.print("Khách hàng đã sử dụng bao nhiêu dịch vụ: ");
            int serviceNumber;
            do {
                try {
                    serviceNumber = new Scanner(System.in).nextInt();
                    if (serviceNumber < 1 || serviceNumber > 5){
                        throw new CheckNumberException();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                } catch (CheckNumberException e){
                    System.out.println("Mỗi khách hàng chỉ được sử dụng tối đa 5 loại dịch vụ khác nhau, vui lòng nhập lại!");
                }
            } while (true);

            InvoiceDetail[] details = new InvoiceDetail[serviceNumber];
            int count = 0;
            //duyệt từng dịch vụ và check xem ID dịch vụ đó có đúng không
            for (int j = 0; j < serviceNumber; j++) {
                System.out.print("Nhập ID dịch vụ thứ "+ (j+1) + " khách hàng đã sử dụng: ");
                int IDservice;
                Service service = null;
                do {
                    try {
                        IDservice = new Scanner(System.in).nextInt();
                        if (IDservice < 100){
                            throw new CheckNumberException();
                        }
                        for (int k = 0; k < serviceLogicManagement.getServices().length; k++) {
                            if (serviceLogicManagement.getServices()[k] != null && serviceLogicManagement.getServices()[k].getIdService() == IDservice) {
                                service = serviceLogicManagement.getServices()[k];
                                break;
                            }
                        }
                        if (customer != null) {
                            break;
                        }
                        System.out.println("Không tồn tại ID dịch vụ vừa nhập, vui lòng nhập lại!");
                    } catch (InputMismatchException e) {
                        System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                    } catch (CheckNumberException e){
                        System.out.print("Vui lòng nhập mã dịch vụ >= 100: ");
                    }
                } while (true);
                System.out.print("Dịch vụ này đã xuất bao nhiêu hóa đơn: ");
                int invoiceNumber;
                do {
                    try {
                        invoiceNumber = new Scanner(System.in).nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
                    }
                } while (true);
                InvoiceDetail invoiceDetail = new InvoiceDetail(service, invoiceNumber);
                details[count] = invoiceDetail;
                count++;
            }
            Invoice invoice = new Invoice(customer, details);
            saveInvoice(invoice);
        }

    }

    public void saveInvoice(Invoice invoice) {
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i] == null){
                invoices[i] = invoice;
                break;
            }
        }
    }

    public void showInvoice() {
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i] != null){
                System.out.println(invoices[i]);
            }
        }
    }

    public void calculateInvoice() {
        for (int i = 0; i < invoices.length; i++) {
            Invoice invoice = invoices[i];
            if (invoice == null) {
                continue;
            }
            Customer customer = invoice.getCustomer();
            InvoiceDetail[] details = invoice.getDetails();
            double expense = 0;
            for (int j = 0; j < details.length; j++) {
                Service service = details[j].getService();
                expense += service.getPrice() * details[j].getServiceInvoice();
            }
            System.out.println("Chi phí của khách hàng "+ customer.getNameCustomer() + " là: " + expense);
        }
    }

    public boolean isEmptyCustomer() {
        for (int i = 0; i < customerLogicManagement.getCustomer().length; i++) {
            if (customerLogicManagement.getCustomer()[i] != null){
                return false;
            }
        }
        return true;
    }

    public void sortByCustomerName() {
        if (isEmptyCustomer()) {
            System.out.println("Chưa có dữ liệu hóa đơn, vui lòng nhập dữ liệu trước khi sắp xếp.");
            return;
        }
        for (int i = 0; i < invoices.length - 1; i++) {
            for (int j = i + 1; j < invoices.length; j++) {
                if (invoices[i].getCustomer().getNameCustomer().compareToIgnoreCase(invoices[j].getCustomer().getNameCustomer()) > 0) {
                    Invoice temp = invoices[i];
                    invoices[i] = invoices[j];
                    invoices[j] = temp;
                }
            }
        }
        showInvoice();
    }


    public void sortByServiceInvoice() {
        if (isEmptyCustomer()) {
            System.out.println("Chưa có dữ liệu hóa đơn, vui lòng nhập dữ liệu trước khi sắp xếp.");
            return;
        }

        for (int i = 0; i < invoices.length; i++) {
            for (int j = 0; j < invoices[i].getDetails().length - 1; j++) {
                for (int k = j + 1; k < invoices[i].getDetails().length; k++) {
                    if(invoices[i].getDetails()[j].getServiceInvoice() > invoices[i].getDetails()[k].getServiceInvoice()){
                        InvoiceDetail temp = invoices[i].getDetails()[j];
                        invoices[i].getDetails()[j] = invoices[i].getDetails()[k];
                        invoices[i].getDetails()[k] = temp;
                    }
                }
            }
        }

        showInvoice();
    }
}
