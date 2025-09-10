package aprendizagem.classe.application;

import java.util.Locale;
import java.util.Scanner;

import aprendizagem.classe.entities.Triangle01; // Temos que importa para

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle01 x, y; // Aqui eu declarei as variáveis do tipo class
        x = new Triangle01();// Aqui eles esta estanciado com o comando new
        y = new Triangle01();// Aqui eles esta estanciado com o comando new

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); // Aqui irei colocar valor no atributo a
        x.b = sc.nextDouble();// Aqui irei colocar valor no atributo b
        x.c = sc.nextDouble();// Aqui irei colocar valor no atributo c

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();// Aqui irei colocar valor no atributo a
        y.b = sc.nextDouble();// Aqui irei colocar valor no atributo b
        y.c = sc.nextDouble();// Aqui irei colocar valor no atributo c

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();

    }
}
/*
 Classe: é um tipo estruturado que pode conter membros, ou seja:
   - Atributos (dados / campos)
   - Métodos (funções / operações)

 Com a palavra-chave "class" conseguimos organizar melhor o código,
 separando responsabilidades e deixando a estrutura mais clara.

 Para usar uma classe, precisamos criar um objeto a partir dela,
 ou seja, **instanciar**.

 O que é instanciar?
 É criar um objeto na memória a partir de uma classe, normalmente
 utilizando o operador "new". Isso é chamado de alocação dinâmica.

 Resumindo:
   - Classe = definição do tipo
   - Objeto = instância da classe

 Exemplo: se eu crio objetos "x" e "y" a partir da mesma classe,
          eles são instâncias diferentes dessa mesma definição.
*/