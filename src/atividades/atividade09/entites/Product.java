package atividades.atividade09.entites;

public class Product {
     private int number;
     private String holder;
     private double deposito;

     public Product(int number, String holder, double deposito){
        this.number = number;
        this.holder = holder;
        this.deposito = deposito;
     }

     public int getNumber(){
         return number;
     }
     public String getHolder(){
         return holder;
     }

     public double getDeposito(){
         return deposito;
     }

     public  void addDepositar(double valor){
         this.deposito += valor;
     }
}
