package atividades.atividade06.application;

import atividades.atividade06.entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
       Locale.setDefault(Locale.US);

        Scanner leitura = new Scanner(System.in);
            Rectangle x;
            x = new Rectangle();

           System.out.println("Enter rectangle width and height:");
            System.out.print("Width: ");
                x.width = leitura.nextDouble();
            System.out.print("Height: ");
                x.heigth = leitura.nextDouble();
            double area = x.Area();
            System.out.printf(" Area:  %.2f%n " , area);


        leitura.close();
    }
}
