package aprendizagem.metodos;

public class Index {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

// Declaração de um metodo
    void exibirAutonomia() {
        System.out.println("A autonomia é: " + capCombustivel * consumoCombustivel + "Km");
    }
}

//  Na declaração de um metodo sempre se começa com um verbo