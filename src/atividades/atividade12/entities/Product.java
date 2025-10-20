package atividades.atividade12.entities;

public class Product {
    private String name;
    private int idade;
    private double altura;

    public Product (String name, int idade, double altura){
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }
    public String getName() {
        return name;
    }
    public double getAltura(){
        return altura;
    }
    public int getIdade(){
        return idade;
    }

    public String toString() {
        return String.format("Nome: %s, Idade: %d, Altura: %.2f", name, idade, altura);

    }
}
