package atividades.atividade25.application;

import atividades.atividade25.entities.LegalPerson;
import atividades.atividade25.entities.NaturalPerson;
import atividades.atividade25.entities.Taxpayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Taxpayers> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ic == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new NaturalPerson(name, anualIncome, healthExpenditures));
            } else{
                System.out.print("Number of employees: ");
                double numberEmployees = sc.nextInt();
                list.add(new LegalPerson(name, anualIncome, numberEmployees));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Taxpayers tp: list){
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
            sc.close();
    }
}
