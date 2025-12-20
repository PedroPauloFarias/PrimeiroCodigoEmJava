package aprendizagem.metodosAbstradas.entities;

import aprendizagem.metodosAbstradas.entities.enums.Color;

public class Rectangle extends Shape {

    private Double width; // largura
    private Double height;// altura

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, Double wight, Double height) {
        super(color);
        this.width = wight;
        this.height = height;
    }


    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }
}
