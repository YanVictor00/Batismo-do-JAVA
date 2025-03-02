package DESAFIOS;

import java.util.Scanner;

public class TESTES {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        String nomeNinja = dados.nextLine();
        System.out.println("Digite a sua idade:");
        int idadeNinja = dados.nextInt();

        String[] dadosNinja = new String[2];
        dadosNinja[0] = nomeNinja;

        System.out.println("Nome do Candidato: " + dadosNinja[0]);




        dados.close();
    }
}
