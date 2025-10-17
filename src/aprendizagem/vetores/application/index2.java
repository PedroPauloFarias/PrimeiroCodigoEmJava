package aprendizagem.vetores.application;

import aprendizagem.vetores.entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
      System.out.print("Digite quantos produtos serão: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n]; // 1

        for(int i = 0; i < vect.length; i++){ //2 Ele ver a quantidade que esta dentro do array
            sc.nextLine(); // limpa o buffer do enter, pois sempre sobra
            System.out.print("Digite um nome: ");
            String name = sc.nextLine();
            System.out.print("Digite o preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        // logo aqui embaixo é a soma dos valores que esta no array
        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){ //Ele ver a quantidade que esta dentro do array
        soma += vect[i].getPrice();// Como na classe está private, temos que usar o getter para ver/ pegar os valores
        }
        double avg = soma / vect.length;
        System.out.printf("Average price: %.2f%n",  avg);

    sc.close();
    }
}
/*
Aqui estamos criando um array tipo referencia,
pois estamos usando uma classe

1- Aqui o tipo dele é o Product, o "vect"
é o nome do array, e como estamos pegando
da classe temos que instanciar

2- Usando o length que é a quantidade elementos no array.
E é até melhor, pois o array sabe o tamanho dele

 */