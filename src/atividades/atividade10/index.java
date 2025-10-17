package atividades.atividade10;

import java.util.Locale;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irar digitar: ");
        int quantity = sc.nextInt(); //Quantidade dos números que serão digitados

        int[] vect = new int[quantity]; // declaração do array

        for(int i = 0; i < quantity; i++){ // Um laço para repetir às vezes que foi digitados
            sc.nextLine(); // limpar o buffer
            System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();// Aqui o array irar armazenar em cada posição, por isso nao colocou o quantity
        }

        System.out.println("Números negativos que foram digitados: ");
        for(int i = 0; i < quantity; i++){ // Aqui ele esta pegando a quantidade e vendo se tem algum negativo
        double negative = 0.0;
            if(vect[i] < 0){
                System.out.printf("%d\n ", vect[i]);
            }
        }
        sc.close();
    }
}
