package atividades.atividade09.application;

import java.util.Locale;
import java.util.Scanner;
import atividades.atividade09.entites.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number/ Digite a matricula: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder/ Digite o seu nome : ");
        String holder = sc.next();
        System.out.print("Is there na initial deposit [Y], [N] ? / Deseja depositar algum valor [Y], [N] ?");
        char resposta = sc.next().charAt(0);
        double novoDeposito = 0.0;
         double depositoInicial = 0.0;
            if (resposta == 'Y' ||  resposta == 'y') {
                System.out.print("Enter initial deposit value/ Digite o deposito inicial: ");
                depositoInicial = sc.nextDouble();
            }// if (resposta == 'N' || resposta == 'n'){
            //System.out.println("The end!!!");
      //  }

        Product produto = new Product(number, holder, depositoInicial);


        // Exibe os dados da conta
        System.out.println();
        System.out.println("Account data / Dados da conta:");
        System.out.println("Número: " + produto.getNumber());
        System.out.println("Titular: " + produto.getHolder());
        System.out.println("Saldo: " + produto.getDeposito());

        System.out.print("Is there na new deposit [Y], [N] ? / Deseja depositar algum novo valor [Y], [N] ?");
       resposta = sc.next().charAt(0);

        if (resposta == 'Y' || resposta  == 'y' ){
            System.out.println("Digite o valor:"  );
            novoDeposito = sc.nextDouble();
        }else{
            System.out.println("The end!!!");
        }
        System.out.println("Account data / Dados da conta:");
        System.out.println("Número: " + produto.getNumber());
        System.out.println("Titular: " + produto.getHolder());
        System.out.println("Saldo: " + produto.getDeposito());
        sc.close();
    }
}
