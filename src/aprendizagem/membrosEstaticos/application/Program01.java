package aprendizagem.membrosEstaticos.application;

import java.util.Locale;
import java.util.Scanner;

import aprendizagem.membrosEstaticos.entities.Calculator;

public class Program01 {
    public static void main(String[]  args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

         double c = Calculator.circumference(radius);// (1)
         double v = Calculator.volume(radius);//(2)

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value %.2f%n", Calculator.PI);//(3)

        sc.close();
    }
}
/*
                Membros Estáticos
Também conhecidos como membros de classes

Não precisam de objeto para serem chamados.
São chamados a partir do próprio nome da classe

Aplicação
- Classes utilitárias
- Declaração de constantes
Exemplo: A função "Math.sqrt()", pois é o nome da classe
e não do objeto

Quando eu utilizar a palavra final em uma função
indica que aquele valor é constante, não mudará,
exemplo; public static final double PI = 3.14159;

Para constantes nomes maiúsculos como o exemplo acima
 public static final double ** PI ** = 3.14159;
 Explicações do código acima:

(1) "Calculator.circumference(radius)"
→ Aqui chamamos um metodo estático. Não foi preciso criar um objeto
`Calculator`,pois o metodo pertence à classe, e não a uma instância.

(2) "Calculator.volume(radius)"
→ Outro exemplo de metodo estático. Ele recebe o raio como parâmetro
 e faz o cálculo direto, sem depender de atributos de um objeto.

(3) "Calculator.PI"
→ Acesso a um atributo estático declarado como `final`. Isso garante
 que o valor de PI é único, constante e compartilhado por toda a classe.
*/