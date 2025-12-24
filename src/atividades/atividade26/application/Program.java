package atividades.atividade26.application;


import atividades.atividade26.model.entities.Account;
import atividades.atividade26.model.exceptions.BussinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Ele tem que ser o primeiro
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();


        Account account = new Account(number, holder, initialBalance, withdrawLimit); // Esta colocando dentro da minha class Account

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New Balance: %.2f%n" + account.getBalance());
        } catch (BussinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
