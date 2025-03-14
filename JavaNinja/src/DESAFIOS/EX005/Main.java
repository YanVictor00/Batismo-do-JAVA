package DESAFIOS.EX005;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double opcao;

        System.out.println("========== BANCO KONOHA ==========");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Sair");
        double saldo = 100;

        opcao = entrada.nextDouble();

        while(opcao != 3){
            if (opcao == 1) {
                ContaCorrente banco = new ContaCorrente(saldo, TipoDeConta.CORRENTE);
                System.out.println(banco.tipoConta);
                System.out.println("Seu saldo é de: R$" + banco.saldo);
                System.out.println("Deposite um valor: R$");
                double valor = entrada.nextDouble();
                System.out.println("Seu deposito foi de R$" + valor);
                System.out.println( "Seu banco não tem taxa de Depósito");
                banco.depositar(valor);
                opcao = 3;

            } else if (opcao == 2) {
                ContaPoupanca banco = new ContaPoupanca(saldo, TipoDeConta.POUPANÇA);
                System.out.println(banco.tipoConta);
                System.out.println("Seu saldo é de: R$" + banco.saldo);
                System.out.println("Deposite um valor: R$");
                double valor = entrada.nextDouble();
                System.out.println("Seu deposito foi de R$" + valor);
                System.out.println( "Seu banco cobra uma taxa de 1% a cada deposito");
                banco.depositar(valor);
                opcao = 3;
            }else {
                System.out.println("ESCOLHA UMA DAS OPÇÕES!");
                opcao = entrada.nextDouble();
            }


        }
        System.out.println("Sistema Finalizado.");




        entrada.close();
    }
}
