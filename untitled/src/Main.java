import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Conta conta1 = new Conta();
        Continuar cont = new Continuar();
        String resposta;
        int deposito;
        int saque = 0;
        int vSaque;


        conta1.setSaldo(1000);
        System.out.println("Bem vindo ao Banco Melo\nSeu saldo é R$" + conta1.getSaldo());

        while (cont.getContinuar()) {

            System.out.println("1 - para Deposito.\n2 - para Saque.\n0 - Para finalizar o sistema.");
            Scanner resposta1 = new Scanner(System.in);
            String opcao = resposta1.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Insira quanto você deseja depositar: ");
                Scanner valorDeposito = new Scanner(System.in);
                deposito = valorDeposito.nextInt();
                conta1.setSaldo(deposito);
                System.out.println("Pronto, você depositou R$" + deposito + "\nSeu novo saldo é R$" + conta1.getSaldo());
            }

            else if (opcao.equals("2")) {
                System.out.println("Insira quanto você deseja sacar: ");
                Scanner valorSaque = new Scanner(System.in);
                saque = valorSaque.nextInt();
                conta1.sacar(saque);

                if (saque > conta1.getSaldo()){
                    System.out.println("Saldo insuficiente para o saque de R$" + saque);
                }
            }

            else if(opcao.equals("0")) {
                System.out.println("Finalizando o sistema . . .\nObrigado por confiar no Banco Melo.");
                cont.setContinuar(false);
                break;
            }
            else {
                System.out.println("Por favor selecione uma das opções!");
            }
        }
    }
}
