package atividades.atividade25.entities;

public class LegalPerson extends Taxpayers {

    private Double employees;

    public LegalPerson(String name, Double anualIncome, Double employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Double getEmployees() {
        return employees;
    }

    public void setEmployees(Double employees) {
        this.employees = employees;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() > 10) {
            return getAnualIncome() * 0.14;
        } else{
            return getAnualIncome() * 0.16;
        }
    }
}
