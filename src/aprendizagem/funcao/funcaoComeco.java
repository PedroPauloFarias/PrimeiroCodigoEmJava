package aprendizagem.funcao;

import java.util.Scanner;
public class funcaoComeco {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
           System.out.println("Digite três números para ver qual é o maior:");
            int a = leitura.nextInt();
            int b = leitura.nextInt();
            int c = leitura.nextInt();

            int higher = max(a, b, c); // chamando a função max
            showResult(higher); // chamando a função showResult. Note que dentro do parâmetro está o higher, que é o maior número
        leitura.close();
    }
    // Nessa função ela irar ver quem é o maior
    public static int max(int x, int y, int z){
        int aux;    
        if (x > y && x > z){
                aux = x;
            } else if (y > z) {
            aux = y;
        } else{
            aux = z;
        }
        return aux;
    }
    // Essa função pega o maior número da outra função(max) e mostra o resultado
   public static void showResult( int valeu){
        System.out.println("Higher = " + valeu);
   }
}
