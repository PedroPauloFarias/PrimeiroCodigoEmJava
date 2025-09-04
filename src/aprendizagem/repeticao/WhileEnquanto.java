package aprendizagem.repeticao;

import java.util.Scanner;

public class WhileEnquanto {
    public static void main(String[] args){
  System.out.println("Digite alguns numeros para poder somar");
  System.out.println("Mas se colocar zero 0 ele terminara e somara tudo: ");
    Scanner leitura = new Scanner(System.in);
        int numeros;
         int soma = 0;

        numeros = leitura.nextInt();

        while(numeros != 0 ){ // Enquanto numeros for diferente que 0
            soma = soma + numeros; // Para poder somar com o numeros anteriores
            numeros = leitura.nextInt(); // ele pedira para adicionar os numeros
        }
    leitura.close();
        System.out.print("A soma desses valores é: ");
        System.out.print(soma);
    }
}

/**
Ela repete um bloco enquanto/ while
a condição for verdadeira

 *** Ela é indica quando não se sabe previamente a
 quantidade de vezes que quer repetir ***

 Sintaxe:
 while(condição){
 comando1
 comando2
 }
 */
