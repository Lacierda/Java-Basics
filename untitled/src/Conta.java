public class Conta {

    private long saldo = 0;

    public long getSaldo(){
        return saldo;
    }

    public void setSaldo(long vSaldo) {
        saldo = saldo + vSaldo;
    }

    public void sacar(long vValor){
        if(vValor > saldo){
            System.out.println("Saldo insuficiente!");
            System.out.println("Seu saldo é R$ " + getSaldo());

        }
        if(vValor<saldo) {
            System.out.println("Foi sacado R$ " + vValor);
            saldo = saldo - vValor;
            System.out.println("Seu novo saldo é R$ " + saldo);
            if(saldo == 0){
                System.out.println("Seu novo saldo é R$0,00");

            }
        }

    }
}

