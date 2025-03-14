package DESAFIOS.EX005;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo){
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        //TODO: TAXA DE 1% DO DEPOSITO
        valor = valor - ((valor * 1) / 100);
        saldo += valor;
        System.out.println("Saldo Atualizado: R$"+ saldo);
    }

    public ContaPoupanca(double saldo, TipoDeConta tipoDeConta){
        this(saldo);
        this.tipoConta = tipoDeConta;
    }

}
