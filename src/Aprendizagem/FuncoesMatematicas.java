package Aprendizagem;

public class FuncoesMatematicas {
    public static void main(String[] args){

    // Funções matematicas  //

// para saber mais funções matematicas pesquise: java.lang.Math

    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    // Essa formula Faz a raiz quadrada do valor entre parenteses
    //sqrt - é a raiz quadrada
    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);
     System.out.println("Valores de raiz quadrada: ");
     System.out.println("A Raiz quadrada de " + x + " = " + A );
     System.out.println("A Raiz quadrada de " + y + " = " + B );
     System.out.println("A Raiz quadrada de 25 = " + C );

    // Essa formula faz a potenciação
    // pow - é a potenciação
     System.out.println("Valores de potenciação: ");
    A = Math.pow(x,y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);
     System.out.println(x + " elevado a " + y + " = " + A);
     System.out.println(x + " elevado ao quadrado = " + B);
     System.out.println("5 elevado ao quadrado = " + C);

    // Essa formula faz o valor absoluto
    //abs - é o valor absoluto
     System.out.println("Valores absolutos: ");
    A = Math.abs(y);
    B = Math.abs(z);// No valor absoluto ele tira o negativo, caso exista
     System.out.println("Valor absoluto de " + y + " = " + A);
     System.out.println("Valor absoluto de " + z + " = " + B);
}
    }
