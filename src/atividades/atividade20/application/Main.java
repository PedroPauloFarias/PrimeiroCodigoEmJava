package atividades.atividade20.application;

import atividades.atividade20.entites.Employee;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.println();
            System.out.println("Employee #" +(i +1) + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        sc.close();
    }
}
