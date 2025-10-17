package atividades.atividade11;

import java.util.Locale;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você irar digitar: ");
        int quantity = sc.nextInt();
        double[] array = new double[quantity];

        for(int i = 0; i < array.length; i++){
            sc.nextLine(); // limpar o buffer
            System.out.print("Digite um número: ");
            array[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        double media = soma / quantity;

        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + media);
        sc.close();
    }
}
// Falta coisa para terminar