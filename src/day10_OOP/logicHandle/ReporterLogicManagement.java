package day10_OOP.logicHandle;

import day10_OOP.entity.Reporter;

import java.util.Scanner;

public class ReporterLogicManagement {
    private Reporter[] reporters = new Reporter[100];

    public Reporter[] getReporters() {
        return reporters;
    }

    public void showReporter() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);
            }
        }
    }

    public void inputReporter() {
        System.out.print("Bạn muốn nhập bao nhiêu phóng viên: ");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin phóng viên thứ " + (i + 1));
            Reporter newReporter = new Reporter();
            newReporter.inputReporterInfo();
            saveReporter(newReporter);
        }
    }

    public void saveReporter(Reporter newReporter) {
        for (int j = 0; j < reporters.length; j++) {
            if(reporters[j] == null) {
                reporters[j] = newReporter;
                break;
            }
        }
    }

    public boolean reporterIsNotEmpty() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                return true;
            }
        }
        return false;
    }

}
