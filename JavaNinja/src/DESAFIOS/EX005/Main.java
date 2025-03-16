package DESAFIOS.EX005;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        int depOUtrans;


        while(opcao != 3){

            System.out.println("========== BANCO KONOHA ==========");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Sair");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1 :
                ContaCorrente ContaCorrente = new ContaCorrente(100, TipoDeConta.CORRENTE);
                System.out.println(ContaCorrente.tipoConta);
                System.out.println("Seu saldo é de: R$" + ContaCorrente.saldo);

                System.out.println("ESCOLHA UMA TRANSAÇÃO");
                System.out.println("1 - DEPOSITAR");
                System.out.println("2 - ENVIAR PIX");
                System.out.println("3 - VERIFICAR SALDO");
                depOUtrans = entrada.nextInt();

                if (depOUtrans == 1){
                    System.out.println("Deposite um valor: R$");
                    double valor = entrada.nextDouble();
                    System.out.println("Seu deposito foi de R$" + valor);
                    System.out.println( "Seu banco não tem taxa de Depósito");
                    ContaCorrente.depositar(valor);
                    ContaCorrente.saldo = ContaCorrente.saldo + valor;
                }

                break;

                case  2:
                ContaPoupanca ContaPoupanca = new ContaPoupanca(100, TipoDeConta.POUPANÇA);
                System.out.println(ContaPoupanca.tipoConta);
                System.out.println("Seu saldo é de: R$" + ContaPoupanca.saldo);
                System.out.println("Deposite um valor: R$");
                double valor = entrada.nextDouble();
                System.out.println("Seu deposito foi de R$" + valor);
                System.out.println( "Seu banco cobra uma taxa de 1% a cada deposito");
                ContaPoupanca.depositar(valor);


                default:
                System.out.println("ESCOLHA UMA DAS OPÇÕES!");
                opcao = entrada.nextInt();
            }

        }
        System.out.println("Sistema Finalizado.");
        entrada.close();
    }
}
