package atividades.atividade17;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            double somaPares = 0.0;
            double mediapares = 0.0;
            int npares = 0;
        System.out.print("Quantos elementos vai ter o vetor? ");
            int n = sc.nextInt();
            double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite o "+ (i + 1) + " numero: ");
            vect[i] = sc.nextDouble();
        }
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                somaPares += vect[i];
                    npares++;
            }
        }
        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            mediapares = (double)somaPares / npares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        }

        sc.close();
    }
}
