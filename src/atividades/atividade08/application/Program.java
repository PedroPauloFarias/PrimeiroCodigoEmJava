package atividades.atividade08.application;

import atividades.atividade08.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
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

        /* 1 */
        produto.terceiraProva(sc);

        System.out.println();
        System.out.println();
        System.out.println("Aluno: " + produto.name);
        System.out.printf("Média final: %.2f%n", produto.mediaFinal());
        System.out.println("Resultado: " + produto.resultadoAprovadoReprovado());
        sc.close();
    }
}
/*
                        Referencias

1-) Aqui ele ler se for necessário a terceira nota

 */