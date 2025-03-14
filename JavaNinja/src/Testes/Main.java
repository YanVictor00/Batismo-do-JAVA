package Testes;

public class Main {
    public static void main(String[] args) {
        double valor = 10;
        double saldo = 100;
        double porcetagem = (valor * 1) / 100;
        valor = valor - porcetagem;
        saldo += valor;

        System.out.println(saldo);

    }
}
