package aprendizagem.estruturasCondicionais;

import java.util.Scanner;

public class se_If {
    public static void main(String[] args){
        int horas;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantas horas são agora? ");
        horas = leitura.nextInt();
        if (horas < 12){
            System.out.println("Bom dia");
        } else {
            if(horas < 18){
                System.out.println("Boa tarde");
            }else{
                System.out.println("Boa noite");
            }
        }
        leitura.close();
    }
}


/**
 É uma estrutura de controle que permite definir
 que um certo bloco de comandos somente será executado
 dependendo de uma condição.

 temos dois tipos de estruturas condicionais as simples e as compostas

 Na simples se ela for falsa, nao irar aparecer.
 É como se ela pulasse pois afirmação é falsa.
 Exemplo:
 if (){

 }
 Na composta
 Exemplo:
 if (){

 }
 else{

 }

 Também temos os Encadeamento de Estruturas Condicionais
 Onde podemos tratar mais de duas possibilidades
 Exemplo:
 if(condição 1){

 }else{
 if(condição 2){

 }else{

 }
 }
 */
/**int horas;
 Scanner leitura = new Scanner(System.in);
 System.out.println("Quantas horas são agora? ");
 horas = leitura.nextInt();
 if (horas < 12){
 System.out.println("Bom dia");
 } else {
 System.out.println("Boa tarde");
 }
 leitura.close();
 */
