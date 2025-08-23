import java.util.Locale;
import java.util.Scanner;

public class Hello {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
               System.out.print("Digite o seu nome: ");
                    String nome;
                    int idade;

                    nome = sc.next();
               System.out.print("Digite a sua idade: ");
                    idade = sc.nextInt();
               System.out.println("O seu nome é " + nome + " e a sua idade é " + idade);

         sc.close();
     }
}
     /**
          System.out.print("Digite sua idade: ");
          Scanner sc = new Scanner(System.in);
          int idade;
          idade = sc.nextInt();
          System.out.println("Essa idade é sua " + idade);
          sc.close();
      */

     /**
          System.out.println("Digite o seu nome: ");
          Scanner sc = new Scanner(System.in); // Esse code faz com que vc(usuario) digite no teclado
               String nome; // A declaração da variavel
               nome = sc.next(); // aqui é para a variavel receber o valor digitado, mas é so letras

               System.out.println( "Obrigado por digitar " + nome);
          sc.close(); //Tem que colocar o fechamento dele toda vez
          // É importante tambem fazer uma importaçao de: import java.util.Scanner;
      */

          /**
          // Aqui tem uma operção com Casting
          double a;
          int b;
          a = 5.0; // Aqui a letra "a" recebe esse valor
          b = (int) a; // Essa parte do int é necessaria, pois um valor é double e aqui eu quero ele em int
          System.out.println(a); // Valor em double
          System.out.println(b); // Valor em int
           */

          /**
          //Isso é um Casting - a converção explicita de tipos de dados
          int a, b;
          double resultado;
          a = 5; // Aqui a letra "a" recebe esse valor
          b = 2; // Aqui a letra "b" recebe esse valor
          resultado = (double) a / b; // Essa parte do double é importante para mostrar que voce quer que os valores sejam double
          System.out.println(resultado);
           */
    /**
     // Nesse exemplo aqui as letras recebem os número por intermédio da =
         int b, h, B;
         b = 6;
         h = 5;
         B = 8;
         int area = (b + B) / 2 * h;

     System.out.println(area);
     */


/**
 int x;
double y;

x = 5;
y = 2 * x;
 System.out.println(x);
 System.out.println(y);
 */


   /**
    int x = 32;
    double y = 10.69953;
    double z = 62.0999;
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n", z);
        Locale.setDefault(Locale.US);
        System.out.printf("%.5f%n", z);
            System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado =  %.2f metros%n", y );
        String nome = "Ana Clara";
        int idade = 17;
        double renda = 200.00;
        System.out.printf("%s tem %d anos e sua renda é de R$ %.2f reais %n ", nome, idade, renda );
     */
   /**
    * public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double price3 = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $%.2f", product1, price1);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender %s: ", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %f", price3);
        System.out.println();
        System.out.printf("Rouded (three decimal places): %f.3", price3);
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", price3);
*/
