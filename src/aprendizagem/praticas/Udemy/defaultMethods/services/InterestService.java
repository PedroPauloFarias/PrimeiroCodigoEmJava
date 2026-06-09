package aprendizagem.praticas.Udemy.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

   default double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }


}
/*
Aqui estou usando o metodo default, e como podemos ver; aqui está o metodo de pagamento
que fica em  um unico lugar, evitando repetições. Sendo que uma classe nao influencia outra
 */