package aprendizagem.Repeticao;

import java.util.Scanner;
import java.util.Locale;

public class DoWhile {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
           char resp;
               do {
                   System.out.print("Digite a temperatura em Celsius: ");
                   double C = sc.nextDouble();
                   double F = 9.0 * C / 5.0 + 32.0;
                   System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
                   System.out.print("Deseja repetir (s/n)? ");
                   resp = sc.next().charAt(0);
                } while (resp != 'n');
        sc.close();
    }
}
/**
            A estrutura de repetição de controle Faça Enquanto

 Ela é menos usada, ela executa pelo menos uma vezes

 Sintaxe
    do {
    comando1
    comando2
 }while(condição);


 */