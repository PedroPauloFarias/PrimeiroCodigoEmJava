package aprendizagem.classe.entities;

public class Product02 {
    public String name; // 1 atributos
    public double price; // 2 atributos
    public int quantity; // 3 atributos

    // 4
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity; // 5
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity; // 6
    }
    public String toString(){ // 7
        return name
                +  ", $ "
                +  String.format("%.2f", price )
                +  ", "
                +  quantity
                +  " units, Total: $ "
                +  String.format("%.2f",totalValueInStock());
    }
}
/*
                    Aqui é uma classe

1-) nome do produto
2-) preço do produto
3-) Quantidade do produto
4-) aqui tem algumas funções
5-) quantity sem this é o parâmetro
6-) uantity sem this é o parâmetro
7-) ele converte para texto
-)

o this ele se refere ao atributo da class, pois nesse code tivemos uma anbiguidade

 */