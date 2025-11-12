public class gerente extends funcionario{

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override

    public double calcularPagamento() {
        return getSalario() + bonus;
    }
}
