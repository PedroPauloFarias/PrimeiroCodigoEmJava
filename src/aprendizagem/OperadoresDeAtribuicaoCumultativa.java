package aprendizagem;

import java.util.Scanner;
import java.util.Locale;

public class OperadoresDeAtribuicaoCumultativa {
    public static void main(String[] args){
   System.out.println("Digite os minutos para ver quanto você irar pagar");
   Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2.0; // conta = conta + (minutos - 100) * 2.0
        }
        System.out.printf("Valor da conta = R$ %.2f%n ", conta);
    sc.close();
    }
}

/**
 É uma forma abreviada e mais rapida

 Operadores de atribuição cumultativa
 a += b     é igual " a = a + b "
 a -= b     é igual " a = a - b "
 a *= b     é igual " a = a * b "
 a /= b     é igual " a = a / b "


 */