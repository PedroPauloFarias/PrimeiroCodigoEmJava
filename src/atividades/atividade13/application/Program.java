package atividades.atividade13.application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados: ");
         int  n = sc.nextInt(); // aqui ele lê os numeros digitados
         int[] array = new int[n]; // aqui ele cria um array do tamanho da quantidade de numeros que serao digitados
            // logo abaixo ele pede para digitar os numeros, e depois armazena no array
        for(int i = 0; i < array.length; i++){
            System.out.println("Digite o " + (i +1) + " numero: ");
            array[i] = sc.nextInt();
        }

        System.out.println("-----------------------------------");
        int quanity = 0; // Aqui é para ver a quantidade de numero pares
        System.out.println("NUMEROS PARES: " );
             for(int i = 0; i < array.length; i++){
                 if(array[i] % 2 == 0){
                    System.out.println(array[i]);
                    quanity++;
             }
         }
             // aqui mostra a quantidade
        System.out.println("Quantidade de numeros pares: " + quanity);
        sc.close();
    }
}
