package aprendizagem.polimorfismo.application;

import aprendizagem.polimorfismo.entities.Account;
import aprendizagem.polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);//Conta comum
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); // Conta poupança

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
/*
Aqui esta o polimorfismo, pois eu chamei a mesma operação
em variaveis do mesmo tipo, tendo comportamentos diferentes

 */