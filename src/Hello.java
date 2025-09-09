//import java.util.Locale;
//import java.util.Scanner;

public class Hello {
     public static void main(String[] args){

     }
}
          /**
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
           */

       /**
         Scanner sc = new Scanner(System.in);
            String s1, s2, s3;

            s1 = sc.nextLine();// O nextLine ler a palavra toda (com espaços)
            s2 = sc.nextLine();
            s3 = sc.nextLine();
            System.out.println("Dados digitados: ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
         sc.close();
        */

       /**
         Scanner sc = new Scanner(System.in);
               System.out.print("Digite o seu nome: ");
                    String nome;
                    int idade;

                    nome = sc.next();// le a palavra sem espaços
               System.out.print("Digite a sua idade: ");
                    idade = sc.nextInt();
               System.out.println("O seu nome é " + nome + " e a sua idade é " + idade);

         sc.close();
        */

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
                                   // Aqui tem uma operção com Aprendizagem.Casting
          double a;
          int b;
          a = 5.0; // Aqui a letra "a" recebe esse valor
          b = (int) a; // Essa parte do int é necessaria, pois um valor é double e aqui eu quero ele em int
          System.out.println(a); // Valor em double
          System.out.println(b); // Valor em int
           */

          /**
          //Isso é um Aprendizagem.Casting - a converção explicita de tipos de dados
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
        System.out.printf("%s tem %d anos e sua renda é de R$ %.2f reais %n ", nome, idade, renda ); // R$ %.2f reais %n  Significa quantos numeros apos a virgula
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
