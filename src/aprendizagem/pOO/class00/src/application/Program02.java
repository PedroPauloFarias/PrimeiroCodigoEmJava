package aprendizagem.pOO.class00.src.application;

import java.util.Scanner;
import java.util.Locale;
import aprendizagem.pOO.class00.src.entities.Product02;

public class Program02 {
    public static void main(String[] args){
 Locale.setDefault(Locale.US);
  Scanner leitura = new Scanner(System.in);
    Product02 product = new Product02(); // 1
    System.out.println("Enter product data: ");
    System.out.print("Name: ");
        product.name = leitura.nextLine(); // Aqui leio no produto e guardo no campo name
    System.out.print("Price: ");
        product.price = leitura.nextDouble();// Aqui leio no produto e guardo no campo preço
    System.out.print("Quantity in stock: ");
        product.quantity = leitura.nextInt();// Aqui leio no produto e guardo no campo quantidade

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    int quantity = leitura.nextInt();
    product.addProducts(quantity); // 5
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be removed in stock: ");
    quantity = leitura.nextInt();
    product.removeProducts(quantity);
    System.out.println("Updated data: " + product);

  leitura.close();
    }
}
/*
1-)
Por que essa linha 11, (Product02 product = new Product02();) ?

- Aqui temos a declaração de uma variável chamada "product", que é do tipo "Product02".
- "Product02" é uma classe (ou entidade) que possui os atributos: name, price e quantity.
- O operador "new" serve para instanciar a classe, ou seja, criar um objeto na memória a partir dela.
- Esse objeto é armazenado na variável "product", que é uma referência para ele.

Resumindo:
Classe = definição do molde
Objeto = instância criada a partir do molde
"new Product02()" = cria o objeto
"product" = variável que aponta para esse objeto

5-) Isso faz adicionar mais no "product"
*/
