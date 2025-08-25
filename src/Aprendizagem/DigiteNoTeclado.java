package Aprendizagem;

import java.util.Scanner; // É importante tambem fazer uma importaçao de: import java.util.Scanner;

public class DigiteNoTeclado {
    public static void main(String[] args){
        // Scanner com espaços//
    Scanner sc = new Scanner(System.in); // Sempre tem que abrir para poder digitar no terminal
    String s1, s2, s3; // variavel, para poder receber a entrada do teclado

// Aqui esta mostrando que as variaveis "s1,s2, s3", irar receber o numero digitado no teclado
    s1 = sc.nextLine();// O nextLine lê  todas as palavras que forem digitas (com espaços)
    s2 = sc.nextLine();
    s3 = sc.nextLine();

            System.out.println("Dados digitados: ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
         sc.close(); // Sempre tem que fechar
    }
}

/**             // Scanner sem espaços//

Scanner sc = new Scanner(System.in); // Sempre tem que abrir para poder digitar no terminal

    String nome; // variavel
    int idade; // variavel

    System.out.print("Digite o seu nome: ");
    nome = sc.next();// lê uma unica palavra sem espaços

    System.out.print("Digite a sua idade: ");
    idade = sc.nextInt(); // nextInt para a variavel int

    System.out.println("O seu nome é " + nome + " e a sua idade é " + idade);

sc.close(); // Sempre temos que fechar

 */

/**
 System.out.print("Digite sua idade: ");
 Scanner sc = new Scanner(System.in);
    int idade;

    idade = sc.nextInt();// Aqui esta mostrando que a variavel "idade", irar receber o numero digitado no teclado
    System.out.println("Essa idade é sua " + idade);
 sc.close();
 */

/**
 System.out.println("Digite o seu nome: ");
 Scanner sc = new Scanner(System.in); // Esse code faz com que vc(usuario) digite no teclado
 String nome; // A declaração da variavel
 nome = sc.next(); // aqui é para a variavel receber o valor digitado, mas é so letras

 System.out.println( "Obrigado por digitar " + nome);
 sc.close(); //Tem que colocar o fechamento dele toda vez

 */