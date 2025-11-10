package aprendizagem.heranca.entities;
// Essa daqui é a SUBCLASSE
public class BusinessAccount extends Account {

    private Double loanlimite;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanlimite) {
        super(number, holder, balance);
        this.loanlimite = loanlimite;
    }

    public Double getLoanlimite() {
        return loanlimite;
    }

    public void setLoanlimite(Double loanlimite) {
        this.loanlimite = loanlimite;
    }

    public void loan (double amount){
        if(amount <= loanlimite) {
            balance += amount - 10.0;
        }
    }
    @Override // para indicar que é uma sobreposição
    public void withdraw(double amount) {
       super.withdraw(amount);
       balance -= 2.0;
    }
}
/*
O extends é usado para indicar herança

Aqui eu estou dizendo que a minha classe BusinessAccount vai
herdar tudo da minha classe Account

BusinessAccount <---- Account

 */