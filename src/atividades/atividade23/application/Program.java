package atividades.atividade23.application;

import atividades.atividade23.entities.Employee;
import atividades.atividade23.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee#" + i +  " data: ");
            System.out.print("Outsource (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();// Para consumir a quebre de linha
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHours = sc.nextDouble();
            if (ch == 'y' || ch == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }
        }
        //Aqui ele irar percorrer a minha lista mostrando os resultados
        System.out.println();
        System.out.println("Payments:");
        for(Employee emp: list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
