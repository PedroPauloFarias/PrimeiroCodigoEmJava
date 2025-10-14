package aprendizagem.construtores.entities;

public class Product {
    public String name;  //Atributo
    public double price; //Atributo
    public int quantity; //Atributo

// 1 - Aqui está o nosso construtor
    public Product(String name, double price, int quantity){
        this.name = name; // 2
        this.price = price;
        this.quantity = quantity;
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
o construtor sempre colocamos depois dos
atributos
2 - Aqui usamos o "this", pois temos que referenciar o atributo ao parametro
 */