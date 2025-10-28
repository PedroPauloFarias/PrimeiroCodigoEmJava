package aprendizagem.outros;

                //Isso é um Aprendizagem.Casting - a converção explicita de tipos de dados

public class Casting {
    public static void main(String[] args){
        // Aqui tem uma operção com Aprendizagem.Casting

        double a; // valores flutuantes
        int b; // valores inteiros

        a = 5.0; // Aqui a letra "a" recebe esse valor
        b = (int) a; // Essa parte do int é necessaria, pois um valor é double e aqui eu quero ele em int

        System.out.println(a); // Valor em double
        System.out.println(b); // Valor em int
    }
}

/**

        int a, b; // Esta declarando as variaveis
        double resultado; // Esta declarando a variavel

        a = 5; // Aqui a letra "a" recebe esse valor
        b = 2; // Aqui a letra "b" recebe esse valor

        resultado = (double) a / b; // Essa parte do double é importante para mostrar que voce quer que os valores sejam double

        System.out.println(resultado);
*/