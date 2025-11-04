package aprendizagem.heranca.application;

import aprendizagem.heranca.entities.Account;
import aprendizagem.heranca.entities.BusinessAccount;
import aprendizagem.heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Pedro", 20.000);
        BusinessAccount bacc = new BusinessAccount(1002, "Ana", 30.000, 80.000);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 =  new BusinessAccount(1003, "Leo", 4.000, 0.0);
        Account acc3 = new SavingsAccount(1004, "Clara", 50.000, 100.000);

        //DOWNCASTING


    }
}
