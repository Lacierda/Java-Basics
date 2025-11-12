public class moto extends Veiculo {

    private int cilindradas;
    private String ciclistica;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCiclistica() {
        return ciclistica;
    }

    public void setCiclistica(String ciclistica) {
        this.ciclistica = ciclistica;
    }

    @Override

    public String exibirInfo() {
        return super.exibirInfo() + "\nCilindradas: " + cilindradas + "\nCiclistica: " + ciclistica;
    }
}
