package DESAFIOS.EX005;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo Atualizado: R$"+ saldo);
    }

    public ContaCorrente(double saldo, TipoDeConta tipoDeConta){
        this(saldo);
        this.tipoConta = tipoDeConta;
    }
}
