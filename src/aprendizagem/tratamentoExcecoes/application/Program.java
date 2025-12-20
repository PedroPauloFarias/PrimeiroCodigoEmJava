package aprendizagem.tratamentoExcecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
        System.out.println("End of program");


    }
    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }
    public static void method2() {
        System.out.println("*** METHOD2 START ***");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite diferentes nomes dando espaço");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Agora vamos ver a posição deles: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();// para ver onde eu erro, e pq deu erro
        } catch (InputMismatchException e) {
            System.out.println("Enter invalid");
        }
        sc.close();
        System.out.println("*** METHOD2 END ***");
    }

}
