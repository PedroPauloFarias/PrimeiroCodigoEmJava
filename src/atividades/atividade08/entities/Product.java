package atividades.atividade08.entities;

import java.util.Scanner;

public class Product {
    public String name;
    public double a1;
    public double a2;
    public double a3; // só vai ser usada se precisar

    /* 1 */
    public double mediaA1A2() {
        return a1 + a2;
    }

    /* 2 */
    public void terceiraProva(Scanner sc) {
        if (mediaA1A2() < 6.00) {
            System.out.println("Irar ter que fazer a recuperação");
            System.out.println("Digite a nota da recuperação: ");
            a3 = sc.nextDouble();
        } else {
            a3 = -1; //  valor inválido só pra indicar que não foi usada
        }
    }

    /* 3 */
    public double mediaFinal() {
        if (a3 == -1) {
            return mediaA1A2();
        } else {
            return a1 + a2 + a3;
        }
    }

    /* 4 */
    public String resultadoAprovadoReprovado() {
        return mediaFinal() >= 6.00 ? "Aluno Aprovado " : "Aluno Reprovado ";
    }
}

/*
                        Referencias

1-) Calcula a média

2-) Se o aluno ficar de recuperação irar ficar para cá, pois a nota
dele foi inferior a 6.00, mas se a nota dele acima de 6.00 ele não precisa
fazer a prova

3-) Aqui verá se com as três notas ele ficou acima de 6.00

4-)Aqui eu usei uma função ternaria que ela pega o resultado da "mediaFinal()"
e ver se ficou acima do 6.00 para poder emitir a resposta para ver se o
aluno foi reprovado ou não

 */



