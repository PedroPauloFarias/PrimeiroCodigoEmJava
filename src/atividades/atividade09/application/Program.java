package atividades.atividade09.application;

import java.util.Locale;
import java.util.Scanner;
import atividades.atividade09.entites.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y / n)?" );
        char resposta = sc.next().charAt(0);
            if (resposta == 'Y' || resposta == 'y'){
                System.out.print("Enter initial deposit value: ");
               double inicialDeposit = sc.nextDouble();
               product = new Product (number, holder, inicialDeposit);
            } else {
                product = new Product(number, holder);
            }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(product);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        product.depositnew(depositValue); // Essa operação irar fazer o depósito na conta
        System.out.println("Updated account data: ");
        System.out.println(product);
        System.out.println();

        System.out.println("Account data:");
        System.out.println(product);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        product.sacar(withdrawValue); // Essa operação irar fazer o
        System.out.println("Updated account data: ");
        System.out.println(product);
        sc.close();
    }
}
/*
Se a pessoa quiser depositar vamos usar o construtor de tres; que irar
mostrar o number, holder e inicialDeposit
Mas se ele nao quiser depositar irar mostrar apenas
a sobrecarga de dois; number e holder
 */
