package aprendizagem.metodos;

public class Program {
    public static void main(String[] args) {
        Index carro = new Index();

        carro.marca = "Fiat";
        carro.modelo = "Punto";
        carro.numPassageiros = 5;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);

        carro.exibirAutonomia();
    }
}
