package day13_OOP.logicHandle;

import day13_OOP.Exception.CheckNumberException;
import day13_OOP.entity.Service;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceLogicManagement {
    private Service[] services = new Service[100];

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "ServiceLogicManagement{" +
                "services=" + Arrays.toString(services) +
                '}';
    }

    public void inputService() {
        System.out.print("Bạn muốn nhập bao nhiêu dịch vụ: ");
        int serviceNumber;
        do {
            try {
                serviceNumber = new Scanner(System.in).nextInt();
                if (serviceNumber < 1 || serviceNumber > 100){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.print("Vui lòng nhập số dịch vụ từ 1 - 100: ");
            }
        } while (true);

        for (int i = 0; i < serviceNumber; i++) {
            System.out.println("Nhập thông tin dịch vụ thứ "+ (i+1)+": ");
            Service service = new Service();
            service.inputInfo();
            saveService(service);
        }
    }

    public void saveService(Service service) {
        for (int j = 0; j < services.length; j++) {
            if (services[j] == null) {
                services[j] = service;
                break;
            }
        }
    }

    public void showService() {
        for (int j = 0; j < services.length; j++) {
            if (services[j] != null) {
                System.out.println(services[j]);
            }
        }
    }

    public boolean serviceIsNotEmpty() {
        for (int j = 0; j < services.length; j++) {
            if (services[j] != null) {
                return true;
            }
        }
        return false;
    }
}
