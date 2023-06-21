package day10_OOP.main;

import day10_OOP.entity.ArticleType;
import day10_OOP.entity.Payroll;
import day10_OOP.entity.PayrollDetail;
import day10_OOP.entity.Reporter;
import day10_OOP.logicHandle.MenuLogicManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MenuLogicManagement menuLogicManagement = new MenuLogicManagement();
        menuLogicManagement.menu();
    }

}
