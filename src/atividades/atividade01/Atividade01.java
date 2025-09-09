package atividades.atividade01;

import java.util.Scanner;
import java.util.Locale;

public class Atividade01 {
    public static void main(String[] args){
   Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);
     System.out.println("--------------------------------");
     System.out.println("Calculador do valor do terreno");
     System.out.println("--------------------------------");
     System.out.println("O metro quadrado é avalidao em mil reais (R$1.000,00) ");

        double largura, comprimento;
        double  preco, PrecoDoMetroQuadrado;

        PrecoDoMetroQuadrado = 1000;

        System.out.print("Informe a largura do terreno: ");
        largura = entrada.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        comprimento = entrada.nextDouble();

        double area = largura * comprimento;
        preco = area * PrecoDoMetroQuadrado;

        System.out.printf("O valor do terreno é equivalente: R$ %.2f reais %n ",  preco );
     entrada.close();
        }
}
// o System.out.printf(); - Significa quantos numeros pos a virgula ou o ponto