public class carro extends  Veiculo{

    private String portas;
    private int aro;


    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }


    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    @Override

    public String exibirInfo () {
        return super.exibirInfo() + "\nQuantidade de portas: " + portas + "\nTamanho do aro: " + aro;
    }
}
