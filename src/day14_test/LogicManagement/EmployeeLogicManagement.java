package day14_test.LogicManagement;

import day14_test.Exception.CheckNumberException;
import day14_test.entity.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeLogicManagement {
    private Employee[] employees = new Employee[100];

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void inputEmployee() {
        System.out.print("Bạn muốn nhập bao nhiêu nhân viên: ");
        int employeeNumber;
        do {
            try {
                employeeNumber = new Scanner(System.in).nextInt();
                if (employeeNumber < 1 || employeeNumber > 100){
                    throw new CheckNumberException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            } catch (CheckNumberException e){
                System.out.print("Vui lòng nhập số nhân viên từ 1 - 100: ");
            }
        } while (true);

        for (int i = 0; i < employeeNumber; i++) {
            System.out.println("Nhập thông tin nhân viên thứ "+ (i+1) + " : ");
            Employee employee = new Employee();
            employee.inputInfoEmployee();
            saveEmployee(employee);
        }

    }

    public void saveEmployee(Employee employee) {
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] == null) {
                employees[j] = employee;
                break;
            }
        }
    }

    public void showEmployee() {
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null) {
                System.out.println(employees[j]);
            }
        }
    }

    public boolean employeeIsNotEmpty() {
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null) {
                return true;
            }
        }
        return false;
    }
}
