package aprendizagem.estruturasCondicionais;

public class ternaria {
    public static void main(String[] args){
        double preco = 34.5;
        double desconto = (preco > 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
/*
 É uma estrutura opicional a if-else quando se
 deseja decidir um valor com base em uma condição

 sintaxe
 (condição) ? valor_se_verdadeiro : valor_se_falso

 // Esse é o com if-else
 if(preco > 20){
 desconto = preco * 1.0;
 }else{
 desconto = preco * 0.05;
 }
 */