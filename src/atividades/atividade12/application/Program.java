package atividades.atividade12.application;

import atividades.atividade12.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, idade;
        String name;
        double altura, mediaAltura;
        int menoreDe16 = 0;
        double soma = 0.0;

        System.out.println("Quantas pessoas serão digitadas: ");
        n = sc.nextInt();
        Product[] array = new Product[n];

        for(int i = 0; i < array.length; i++){
                sc.nextLine();
            System.out.print("Digite o " + (i+ 1) + " nome: ");
                name = sc.nextLine();
            System.out.print("Digite da " + (i+ 1) + " idade: ");
                idade = sc.nextInt();
            System.out.print("Digite da " + (i+ 1) + " altura: " );
               altura = sc.nextDouble();
            array[i] = new Product(name, idade, altura);

        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            soma += array[i].getAltura();
        }

    mediaAltura = soma / array.length;
    System.out.printf( "MEDIA: %.2f%n",  mediaAltura);
    // Logo abaixo ele esta vendo quais que são menores que 16, temos que colocar o for,
   // pois ele tem que verificar no array e colocar um if
        for(int i = 0; i < array.length; i++){
            if(array[i].getIdade() < 16){
                System.out.println("Menores de 16: " +  array[i].getName());
            }
        }

        sc.close();
    }
}
