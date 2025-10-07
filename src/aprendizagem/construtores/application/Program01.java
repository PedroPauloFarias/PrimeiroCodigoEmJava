package aprendizagem.construtores.application;

import java.util.Locale;
import java.util.Scanner;
import aprendizagem.construtores.entities.Product;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name,  price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
         quantity = sc.nextInt();
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
Construtor
É quando vc estancia o objeto,
quando você dá o comando "new" o construtor
será executado naquele momento

um construtor é um metodo especial que tem o mesmo nome
da classe e é chamado automaticamente ao criar um novo objeto com a palavra-chave new.
Sua principal função é inicializar os atributos do novo objeto, definindo seus valores iniciais.
Construtores não têm tipo de retorno e podem ser definidos com ou sem parâmetros, sendo possível
 ter vários construtores em uma classe para diferentes formas de inicialização.
 */