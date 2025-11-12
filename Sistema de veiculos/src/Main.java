//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    carro c1 = new carro();
    c1.setMarca("Hyundai");
    c1.setModelo("HB20S");
    c1.setAno(2019);
    c1.setPortas("4 portas");
    c1.setAro(15);
    System.out.println(c1.exibirInfo());

    moto m1 = new moto();
    m1.setMarca("Honda");
    m1.setModelo("Cb 500");
    m1.setAno(2025);
    m1.setCilindradas(497);
    m1.setCiclistica("Naked");
    System.out.println(m1.exibirInfo());
    }
}