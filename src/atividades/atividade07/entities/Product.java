package atividades.atividade07.entities;

public class Product {
    public String name;
    public double grossSalary;
    public double tax;

    /* 1 */ public double netSalary(){
        return grossSalary - tax;
    }

    /* 2 */ public void increaseSalary( double percentual){
        grossSalary += grossSalary * percentual/100.0;
    }
   /* 3 */ public String toString(){
    return name + ", $" + String.format("%.2f%n",  netSalary());
    }
}
/*
1-)o netSalary, nos nao precisamos dele lá, mas sim aqui pois aqui
ele faz a conta grossSalary(salarioBruto) - tax(imposto) retornando um
novo salario que sera pedido no increaseSalary

2-)Aqui ele tem quer ser "void", pois ele nao retorna nada.
E temos que declarar o percentual porque o usuario terá que digitar
e com isso podemos fazer a conta com o salary atual por causa da "conta que o
netSalary fez" envolvendo o "tax"

3-) Aqui é para transforma cada public em palvaras,
pois sem ele irar aparecer o da onde
esta vindo e nao o que esta dentro

 */