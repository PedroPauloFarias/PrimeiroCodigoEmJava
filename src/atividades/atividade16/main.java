package atividades.atividade16;

import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite o "+ (i + 1) + " numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i];
        }

       double media = 0.0;
        media = soma / n;
        System.out.print("MEDIA: " + media);
        System.out.println();
        System.out.println("Abaixo da media: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < media){
                System.out.print(vect[i]);
            }
        }
        sc.close();
    }
}
