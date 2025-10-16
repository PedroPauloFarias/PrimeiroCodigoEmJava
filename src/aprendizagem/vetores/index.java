package aprendizagem.vetores;

import java.util.Scanner;
import java.util.Locale;

public class index {
    public static void main(String[] args) {
  Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
        System.out.print("Quantas alturas teremos? ");
        int n = sc.nextInt();
        double[] vect = new double[n]; //aqui temos um array
        for (int i = 0; i < n ; i++ ){
        System.out.print("Digite a sua altura: ");
         vect[i] = sc.nextDouble(); // Aqui temos a leitura
        }
     double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }
        double media = sum / n ;
        System.out.printf("A media dessas alturas é: %.2f%n",  media);
    sc.close();
    }
}
/*
Na linha 11 é a criação de um array de n posições,
que seria as posições que o usuário digitar, o new cria
um array na memória. Já o vect é o nome do array

tipo[] nome = new tipo[tamanho];
double, int, String

Ja na linha do for temos a leitura das alturas que forem digitas
e elas iram ser armazenadas de acordo com a sequencia, pois eu coloque o i

 */