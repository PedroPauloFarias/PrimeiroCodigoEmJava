package aprendizagem.repeticao;

public class forEach {
    public static void main(String[] args) {
        String[] vect =  new String[] {"Maria", "Bob", "Alex"};
        // logo abaixo é assim que normalmente se faz, mas o each é diferente
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------");
        System.out.println("Aqui em baixo é com o laço each: ");
        for(String nomes: vect){ // Aqui ele é uma String, pois esse é o tipo do meu array
            System.out.println(nomes);// Aqui chamamos o nome dele, pois é mais facil assim
        }
    }
}
/*
Ele é formado assim
    for(Tipo nomeDele: array){
        System.out.println(Aqui chamamos o nomeDele);
    }
A leitura dele é assim: Para cada objeto 'nomeDele' contido em vect, faça:
Sendo muito mais pratico e rapido no manuseio
 */