package atividades.atividade08.application;

import atividades.atividade08.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product produto = new Product();

        System.out.println("-------------------------------");
        System.out.println("Verificador de Média: ");
        System.out.println("-------------------------------");

        System.out.println();
        System.out.print("Digite o seu nome: ");
             produto.name = sc.nextLine();
        System.out.print("Digite a nota da primeira prova: ");
            produto.a1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
             produto.a2 = sc.nextDouble();
        System.out.printf("A Media é: %.2f%n", produto.media());
        if (produto.media() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", produto.pontos());
        } else {
            System.out.println("PASS");

            sc.close();
        }
    }
}