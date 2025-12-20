package atividades.atividade25.entities;

public class NaturalPerson extends Taxpayers {

    private Double healthExpenditure;


    public NaturalPerson(String name, Double anualIncome, Double healthExpenditure) {
        super(name, anualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthExpenditure * 0.5;
        } else {
            return getAnualIncome() * 0.25 -healthExpenditure * 0.5;
        }
    }
}
