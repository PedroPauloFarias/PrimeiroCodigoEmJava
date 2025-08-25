public class Casting {
    public static void main(String[] args){
        // Aqui tem uma operção com Casting
        double a;
        int b;
        a = 5.0; // Aqui a letra "a" recebe esse valor
        b = (int) a; // Essa parte do int é necessaria, pois um valor é double e aqui eu quero ele em int
        System.out.println(a); // Valor em double
        System.out.println(b); // Valor em int
    }
}
/**
        //Isso é um Casting - a converção explicita de tipos de dados
        int a, b;
        double resultado;
        a = 5; // Aqui a letra "a" recebe esse valor
        b = 2; // Aqui a letra "b" recebe esse valor
        resultado = (double) a / b; // Essa parte do double é importante para mostrar que voce quer que os valores sejam double
        System.out.println(resultado);
*/