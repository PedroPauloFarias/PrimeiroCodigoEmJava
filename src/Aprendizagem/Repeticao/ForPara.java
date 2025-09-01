package Aprendizagem.Repeticao;

import java.util.Scanner;

public class ForPara {
    public static void main(String[] args){
        System.out.println("digite alguns numeros e a quantidade deles, e no final iremos somar ");
        System.out.println("Quantas vezes você quer que digitar? ");
    Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();
        int soma = 0;
        for(int i = 0; i < N; i++){ // O i++, esta abreviado, pois ele é assim i = i + 1
            int x = leitura.nextInt();
            soma = soma + x;
        }
        System.out.print("A soma dos numeros digitados é igual a " + soma );

    leitura.close();
    }
}
/**
             A estrutura de repetição de controle FOR/PARA

Que é usada quando se sabe previamente
a quantidade de repetições
Sintaxe:
 for (inicio; condição; incremento){
    comando1
    comando2
 }

 */