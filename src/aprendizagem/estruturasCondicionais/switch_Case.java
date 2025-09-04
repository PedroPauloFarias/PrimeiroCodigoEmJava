package aprendizagem.estruturasCondicionais;

import java.util.Scanner;

public class switch_Case {
    public static void main(String[] args){
        System.out.println("Digite um numero para poder ver o dia da semana");
        System.out.println("Os dias da semana vão até o número 7");
        Scanner leitura = new Scanner(System.in);
        int x = leitura.nextInt();
        String dia;
        switch (x){
            case 1:
                dia = "domingo";
                break; // É obrigado a colocar ele
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default: // Caso as opçoes tenhão falhado colocaçe ele
                dia = "valor invalido";
                break;
        }
        System.out.print("O dia da semana do numero " + x + " é " + dia);
        leitura.close();
    }
}
/**
 Ela é usada quando tem se várias opções a serem tradas
 com base no valor da variável, substituindo o if-else encadeado

 */