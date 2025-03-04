package DESAFIOS;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        String cadastroNome[] = new String[18];

        System.out.println("==========MENU NINJA==========");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Digite a opção que você deseja: ");

        String resposta = dados.nextLine();

        //LOOP DO SISTEMA
        while(!resposta.equals("3")) {

            //CONDIÇOES DO VALOR DA RESPOSTA
            switch (resposta) {

                //CADASTRAR NINJA
                case "1":
                    System.out.println("==========CADASTRAR NINJA==========");
                    System.out.println("Caso queira sair escreva 'VOLTAR' ");
                    System.out.println("Escreva o nome do ninja: ");

                    for (int i = 0; i < cadastroNome.length; i++) {
                        String nomeCliente = dados.nextLine();

                        //VOLTAR O MENU
                        if (nomeCliente.toUpperCase().equals("VOLTAR")) {
                            resposta = "2";
                            break;

                        }else {
                            cadastroNome[i] = nomeCliente;
                            System.out.println("Nome adicionado com sucesso!");
                            System.out.println("Caso queira voltar digite 'VOLTAR' ");
                            System.out.println("Escreva de outro ninja: ");

                        }

                    }
                    System.out.println("ESGOTOU A LISTA DE CADASTRO!");
                    System.out.println("------------------------------------");


                    //VOLTAR O MENU
                    System.out.println("==========MENU NINJA==========");
                    System.out.println("1. BLOQUEADO");
                    System.out.println("2. Listar Ninjas");
                    System.out.println("3. Sair");
                    System.out.print("Digite a opção que você deseja: ");
                    String respostaDnv = dados.nextLine();
                    switch (respostaDnv) {
                        case "1":
                            System.out.println("Sistema bloqueado! Renicie!");
                            break;
                        case "2":
                            resposta = "2";
                            break;
                        case "3":
                            System.out.println("Você saiu! Renicie para voltar!");
                            break;

                    }
                    break;

                //Listar Ninjas
                case "2":
                    System.out.println("==========NINJAS CADASTRADOS==========");
                    for (int i = 0; i < cadastroNome.length; i++){
                        if ( cadastroNome[i] != null){
                            System.out.println((i + 1) + " - " + cadastroNome[i]);
                        }
                    }
                    resposta = "3";
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma das opções acima!");
                    resposta = dados.nextLine();
                    break;
            }
        }

        System.out.println("Sistema finalizado!");
        dados.close();
    }
}
