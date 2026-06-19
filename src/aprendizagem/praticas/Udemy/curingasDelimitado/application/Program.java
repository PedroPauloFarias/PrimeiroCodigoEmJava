package aprendizagem.praticas.Udemy.curingasDelimitado.application;

import aprendizagem.praticas.Udemy.curingasDelimitado.entities.Circle;
import aprendizagem.praticas.Udemy.curingasDelimitado.entities.Rectangle;
import aprendizagem.praticas.Udemy.curingasDelimitado.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list) { // Aqui eu estou falando que essa lista pode ser de qualquer tipo
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}