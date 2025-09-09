package atividades.atividade06.application;

import java.util.Scanner;
import atividade06.entities.Retangle;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
         Retangle x;
         x = new Retangle();
            
        System.out.println("Enter rectangle width and height: ");
        x.width = leitura.nextDouble();
        x.height = leitura.nextDouble();
        System.out.printf("AREA:  %.2f%n ", x.area());
        System.out.printf("PERIMETER: %.2f%n ", x.perimeter());
        System.out.printf("DIAGONAL: %.2f%n ", x.diagonal());
        leitura.close();
    }
}
