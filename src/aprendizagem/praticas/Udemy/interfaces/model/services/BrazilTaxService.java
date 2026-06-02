package aprendizagem.praticas.Udemy.interfaces.model.services;

public class BrazilTaxService  implements TaxService{
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
// Se eu precisar mudar algo aqui eu nao mexo no programa principal, pois o programa principal esta atrelado ao TaxService