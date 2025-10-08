package aprendizagem.encapsulamento.application;

import aprendizagem.encapsulamento.entities.Product01;
import java.util.Locale;
import java.util.Scanner;

public class Program01 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product01 product = new Product01(name,  price);
           /*1*/ product.setName("Computer"); // Não chamamos os atributos diretos
            System.out.println("Updated name: " + product.getName()); // Não chamamos os atributos diretos
            product.setPrice(1200.00); //Não chamamos os atributos diretos
            System.out.println("Updated price: " + product.getPrice()); // Não chamamos os atributos diretos


            System.out.println();
            System.out.println("Product data: " + product);
            System.out.println();
            System.out.print("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity);
            System.out.println();
            System.out.println("Updated data: " + product);
            System.out.println();
            System.out.print("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);
            System.out.println();
            System.out.println("Updated data: " + product);
            sc.close();
        }
}


/*
                        Encapsulamento

É um princípio que consiste emm esconder detalhes
de uma classe, expondo apenas operações seguras
e que mantenham os objetos em um estado consistente

Objeto deve estar SEMPRE em um estado CONSISTENTE

Exemplo: Caixa jbl, pois o usuário não tem acesso à parte do
hardware, mas sim só a parte importante para sair a música

O Objeto não deve expor nenhum atributo(vamos usar o private)
E os atributos devem ser acessados por métodos get e set. Não chamamos os atributos diretos
private = não pode ser acessado por outras classes

1- Para colocar um novo valor basta acessar usando o set,
pois ele não está public, mas sim private. Não chamamos os atributos diretos

 */