package atividades.atividade15.application;

import atividades.atividade15.entites.Product;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
     //  Product[] product = new Product(A, B);
        System.out.println("Digite os Valores de A: ");
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print((i + 1 ) + ": ");
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os Valores de B: ");
        for(int i = 0; i < n; i++){
            System.out.print((i + 1 ) + ": ");
            vectB[i] = sc.nextInt();
        }
        int soma = 0;
        System.out.println("SOMA DOS VETORES: ");
        for(int i = 0; i < n; i++){
            soma = vectA.length + vectB.length;
        }
        System.out.println(soma);
        sc.close();
    }
}
