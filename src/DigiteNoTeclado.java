import java.util.Scanner;

public class DigiteNoTeclado {
    public static void main(String[] args){
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
    }
}
