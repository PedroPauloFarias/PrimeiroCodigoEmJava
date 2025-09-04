package atividades;

import java.util.Scanner;

public class Atividade03_While {
    public static void main(String[] args){
        System.out.println("-------------------------------------");
        System.out.println("Verificador de senha correta ");
        System.out.println("-------------------------------------");
        System.out.print("Digite a sua senha correta: ");
        int SenhaCorreta;
        int SenhaInvalida;
            Scanner leitura = new Scanner(System.in);
                SenhaCorreta = leitura.nextInt();
                SenhaInvalida = leitura.nextInt();

                while(SenhaCorreta != SenhaInvalida){
                    System.out.println( SenhaInvalida + " Senha Invalida");
                    SenhaInvalida = leitura.nextInt();
                }
            leitura.close();
                System.out.print(SenhaCorreta + " Senha Valida");
    }
}
/**
        System.out.println("Verificador da senha: ");
        int senha;
        Scanner  leitura = new Scanner(System.in);
            senha = leitura.nextInt();
            while (senha != 2002){
                System.out.println(senha + " Senha Invalida");
                senha = leitura.nextInt();
            }
        leitura.close();
            System.out.println( senha + " Acesso permitido");
*/