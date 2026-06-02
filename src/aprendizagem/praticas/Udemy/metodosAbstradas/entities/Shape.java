package aprendizagem.praticas.Udemy.metodosAbstradas.entities;

import aprendizagem.praticas.Udemy.metodosAbstradas.entities.enums.Color;

// nao pose ser istanciada

public  abstract class Shape {

    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
