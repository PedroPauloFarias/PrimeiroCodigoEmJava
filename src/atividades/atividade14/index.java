package atividades.atividade14;

import java.util.Scanner;
import java.util.Locale;

public class index {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar: ");
            int n = sc.nextInt();
            double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite o " + (i +1) + " numero: ");
            vect[i] = sc.nextDouble();
        }

        double maior = vect[0];
        for(int i = 0; i < vect.length; i++){
            if(vect[i] > maior){
                maior = vect[i];
            }
        }
        System.out.println(maior);

        sc.close();
    }
}
