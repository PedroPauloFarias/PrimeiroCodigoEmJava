package atividades.atividade15.entites;

public class Product {
    private int A;
    private int B;

    public Product(int A, int B){
        this.A = A;
        this.B = B;
    }

    public int getA(){
        return A;
    }

    public int getB() {
        return B;
    }

    public int somaAB(){
        return A + B;
    }
}
