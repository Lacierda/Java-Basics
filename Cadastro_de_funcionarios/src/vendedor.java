public class vendedor extends funcionario{

    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return getSalario() + comissao;
    }
}
