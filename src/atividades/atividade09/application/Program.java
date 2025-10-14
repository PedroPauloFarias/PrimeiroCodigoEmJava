package atividades.atividade09.application;

import java.util.Locale;
import java.util.Scanner;
import atividades.atividade09.entites.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        System.out.println("Is there na initial deposit (y / n)?" );
        char resposta = sc.next().charAt(0);
        double deposit = 0.0;

            if (resposta == 'Y' || resposta == 'y'){
                System.out.print("Enter initial deposit value: ");
                deposit = sc.nextDouble();
            } else {
             System.out.println("The End!!!");
            }
        Product product = new Product(number, holder, deposit);

        System.out.println();
        System.out.println("Account data:");
        System.out.println("Account: " + product.getNumber());
        System.out.println("Holder: " + product.getHolder());
        System.out.println("Balance: " + product.getDeposit());
        System.out.println();
        System.out.println("Enter a deposit  value: ");
        double value = sc.nextDouble();
        product.addDeposit(deposit);
//        deposit= sc.nextDouble();
        System.out.println("Updated account data: ");

       // System.out.println(product.addDeposit(depoist));
        sc.close();
    }
}
