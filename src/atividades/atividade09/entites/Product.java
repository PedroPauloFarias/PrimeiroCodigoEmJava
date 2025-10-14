package atividades.atividade09.entites;

public class Product {

    private int number;
    private String holder;
    private double deposit;

    public Product(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Product(int number, String holder, double depositInicial){
        this.number = number;
        this.holder = holder;
       depositnew(depositInicial);
    }

    public int getNumber(){
        return number;
    }

    public String getHolder(){
        return holder;
    }

   public void setHolder(String holder){
        this.holder = holder;
  }

    public double getDeposit(){
        return deposit;
    }

    public void depositnew(double value ){
        deposit += value;
    }

   public void sacar(double value){
             deposit -= value - 5.0;
   }

   public String toString(){
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: "
                + String.format("%.2f", deposit);
   }
}
