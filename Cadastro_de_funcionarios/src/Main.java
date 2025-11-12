//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        gerente g1 = new gerente();
        g1.setNome("Maurício");
        g1.setSalario(8000);
        g1.setBonus(1200);
        System.out.println(g1.getNome() + " seu salário é R$" + g1.calcularPagamento());
        System.out.println(g1.calcularPagamento());

        vendedor f1 = new vendedor();
        f1.setNome("João Paulo");
        f1.setSalario(4500);
        f1.setComissao(200);
        System.out.println(f1.getNome() + " seu salário é R$" + f1.calcularPagamento());
        System.out.println(f1.calcularPagamento());

    }
}