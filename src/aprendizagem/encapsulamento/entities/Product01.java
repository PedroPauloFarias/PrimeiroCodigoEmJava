package aprendizagem.encapsulamento.entities;

public class Product01 {
    //1
        private String name;
        private double price;
        private int quantity;

        public Product01(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public Product01(String name, double price){
            this.name = name;
            this.price = price;
        }

  /*2*/ public void setName(String name) {
            this.name = name;
        }
 /*3*/  public String getName(){
            return name;
        }

        public double totalValueInStock() {
            return price * quantity;
        }

        public double getPrice(){
            return price;
        }
        public int getQuantity(){
            return quantity;
        }

        public void setPrice(double price){
            this.price = price;
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
1- Aqui todos foram Encapuslados
2- Trocando o nome. Metodo set sendo usado
3- irar mostrar usando o get
 */