package DESAFIOS.EX005;

public abstract class ContaBancaria implements Conta {

    TipoDeConta tipoConta;
    double saldo;

    @Override
    public void consultarSaldo(){
        System.out.println(saldo);
    }

    @Override
    public abstract void depositar(double valor);



}
