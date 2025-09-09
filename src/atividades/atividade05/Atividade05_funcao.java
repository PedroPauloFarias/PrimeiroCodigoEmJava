package atividades.atividade05;

import java.util.Scanner;

public class Atividade05_funcao {
    public static void main(String [] args){
    Scanner leitura = new Scanner(System.in);
        System.out.println("Digite alguns números: ");
        int n1 = leitura.nextInt();
        int n2 = leitura.nextInt();
        int n3 = leitura.nextInt();
        int n4 = leitura.nextInt();
        int n5 = leitura.nextInt();
       int small = min(n1,n2, n3, n4, n5);
       tela(small);
    leitura.close();
    }
    public static int min(int a, int b, int c, int d, int e){

        for(int i = 0; i > 5; i++){
        }// for
            int aux;
            if(a < b && a < c && a < d && a < e ){
                aux = a;
            }else if(b < c && b < d && b < e ){
                aux = b;
            } else if (c < d && c < e) {
                aux = c;
            }else{
                aux = e;
            }
        return aux;

    }
    public static void tela( int valores){
        System.out.println("O menor valor é " + valores);
    }
}
/*
Aqui criarei uma funçao que com um laço, sendo for, para
limitar quantas ele irar fazer e depois ver qual foi o
menor número digitado
 */