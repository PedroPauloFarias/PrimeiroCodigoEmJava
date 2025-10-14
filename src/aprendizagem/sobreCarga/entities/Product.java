package aprendizagem.sobreCarga.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Esse é o construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //1 - Esse é a SobreCarga
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}

/*
Comentarios do Code
Sobre carga é disponibilizar mais de uma versão dá mesma operação

Exemplo da SobreCarga:
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

1 - Apagamos this e o quantity, pois nao tem mais ambiguidade

 */