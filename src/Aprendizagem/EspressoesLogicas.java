package Aprendizagem;

public class EspressoesLogicas {
    public static void main(String[]  args){

    }
}

/**
  São espressões que quando avaliadas resultam no valor verdadeiro ou falso
    Nela usamos a Tabela Verdade

 Aqui temos alguns operadores:

&&  E - Nele todas as condições tem que ser verdadeiras, se uma for falsa ela ficara toda falsa
||  OU - Nele pelo menos uma condição deve ser verdadeira
!   NÃO - O operador "Não" inverte a condição

Exemplo do &&:
 int x = 5;
 x <= 20  && x == 10
Temos que separar cada uma para ver.
 A primeira e verdadeira, pois "x" é menor que "20"
 A segunda é falsa, pois "x" não é igual a "10"
Então, essa conta é falsa, pois no && tudo tem que ser verdade

 x > 0 &&  x != 3
 Essa afirmação esta certa, pois 5(x) é maior que 0
 e 5(x) é diferente que 3

Exemplo do ||:
int x = 5;
 x == 10 || x <= 20
Temos que separar cada uma para ver.
 Essa afirmação esta correta, pois no começo aparece "x" sendo 10 que é falso, mas
 a segunda "x" é menor ou igual 20 que é verdadeira.
 Pois no operador OU só uma afirmação precisa está certa.

Exemplo do !:
int x = 5;
!(x == 10)
Temos que separar cada uma para ver.
 Essa afirmação é verdadeira, pois o x NAO é igual a 10
!(x >= 2)
 Essa afirmação é falsa, 5(x) é maior ou igual a 2? Sim, mas como tem o NÃO
 do lado de fora ele inverte a resposta, passando a ser falsa
 */