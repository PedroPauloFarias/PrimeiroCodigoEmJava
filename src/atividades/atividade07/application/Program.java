package atividades.atividade07.application;

import atividades.atividade07.entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

        Product produto = new Product();

        System.out.print("Name: ");
            produto.name = sc.nextLine();
        System.out.print("Gross salary: ");
            produto.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
            produto.tax = sc.nextDouble();

        System.out.println("");
        System.out.printf("Employee: " + produto );
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentual = sc.nextDouble(); //1
        produto.increaseSalary(percentual);//2
        System.out.println();
        System.out.println("Updated data: " + produto );

        sc.close();
    }
}
/*
1-)Lê o número digitado e guarda em percentual.
2-) Chama o metodo increaseSalary(percentual)
do objeto produto, que deve atualizar o salário com o aumento aplicado.

 */