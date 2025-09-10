package aprendizagem.classe.entities;


public class Triangle01 {
    public double a;
    public double b;
    public double c;
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    } //Como vai retornar algo. Entao nao se usa void
}
/*
                    Aqui é uma classe
A palavra public significa que ele vai poder ser usado em outro arquivo

Aqui está a minha entidade

 */