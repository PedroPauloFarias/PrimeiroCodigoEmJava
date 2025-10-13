package atividades.atividade09.application;

import java.util.Locale;
import java.util.Scanner;
import atividades.atividade09.entites.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number/ Digite a matricula: ");
        int matricula = sc.nextInt();

        System.out.print("Enter account holder/ Digite o seu nome : ");
        String nome = sc.next();

        System.out.print("Is there na initial deposit [Y], [N] ? / Deseja depositar algum valor [Y], [N] ?");
        String resposta = sc.next();

        System.out.print("Enter initial deposit value/ Digite o deposito inicial: ");
        double deposito01 = sc.nextDouble();


        sc.close();
    }
}
