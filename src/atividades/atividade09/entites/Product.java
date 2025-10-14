package atividades.atividade09.entites;

public class Product {

    private int number;
    private String holder;
    private double deposit;

    public Product(int number, String holder, double deposit){
        this.number = number;
        this.holder = holder;
        this.deposit = deposit;
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
//    public double setDeposit(double value){
//        return deposit += value;
//    }

    public void addDeposit(double deposit){
         this. deposit += deposit;
    }

    public String toString() {
    return number +
            holder +
            deposit;
    }
}
