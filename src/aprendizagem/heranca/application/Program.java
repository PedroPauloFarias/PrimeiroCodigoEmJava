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
        Account acc2 = new BusinessAccount(1003, "Leo", 4.000, 0.0);
        Account acc3 = new SavingsAccount(1004, "Clara", 50.000, 100.000);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UpDate!");
        }

        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println( acc6.getBalance());

        Account acc7 = new SavingsAccount(1005, "Paulo", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1006, "Arthur", 2000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }
}
