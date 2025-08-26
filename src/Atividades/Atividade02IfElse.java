package Atividades;

import java.util.Scanner;

public class Atividade02IfElse {
    public static void main(String[] args){
        int ParImpar;
       System.out.println("Verificardor de PAR ou IMPAR");

        Scanner leitura = new Scanner(System.in);
            System.out.print("Digite um número: ");
            ParImpar = leitura.nextInt();
            if(ParImpar % 2 == 0){
                System.out.println("Ele é PAR");
            }else{
                System.out.println("Ele é IMPAR");
            }
        leitura.close();
    }
}
