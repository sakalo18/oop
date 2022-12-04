package pakage2;

import java.util.Scanner;

import static java.lang.System.in;

public class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        final String TEXT_GREEN = "\u001B[32m";
        final String TEXT_RED = "\u001B[31m";
        String startElectricity;
        String startCommand;
        String startFuelSystem ;
        System.out.println("Запустить машину START OR CANSEL");
        String start = sc.next();
        switch (start) {
            case "START":
                System.out.println(TEXT_GREEN + "МАШИНА ЗАВЕДЕНА");
                break;
            case "CANSEL":
                System.out.println(TEXT_RED + "МАШИНА НЕ ЗАВЕДЕНА");
                return;
        }
        System.out.println("Запустить електричество YES or NO");
        startElectricity = sc.next();
        switch (startElectricity) {
            case "YES":
                System.out.println(TEXT_GREEN + "ВЫ ЗАПУСТИЛИ ЕЛЕКТРИЧЕСТВО");
                break;
            case "NO":
                System.out.println(TEXT_RED + "ВЫ НЕ ЗАПУСТИЛИ ЕЛЕКТРИЧЕСТВО");
                break;
        }
        System.out.println("Запустить КОМАНДЫ YES or NO");
        startCommand = sc.next();
        switch (startCommand) {
            case "YES":
                System.out.println(TEXT_GREEN + "ВЫ ЗАПУСТИЛИ КОМАНДЫ");
                break;
            case "NO":
                System.out.println(TEXT_RED + "ВЫ НЕ ЗАПУСТИЛИ КОМАНДЫ");
                break;
        }
        System.out.println("Запустить БЕНЗИНОВУЮ СИСТЕМУ YES or NO");
        startFuelSystem = sc.next();
        switch (startFuelSystem) {
            case "YES":
                System.out.println(TEXT_GREEN + "ВЫ ЗАПУСТИЛИ БЕНЗИНОВУЮ СИСТЕМУ");
                break;
            case "NO":
                System.out.println(TEXT_RED + "ВЫ НЕ ЗАПУСТИЛИ БЕНЗИНОВУЮ СИСТЕМУ");
                break;
        }
    }

}