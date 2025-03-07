package DESAFIOS;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        String cadastroNome[] = new String[18];
        String resposta = "0";
        int cont = 0;

        //LOOP DO SISTEMA
        while( resposta != "3") {

            System.out.println("==========MENU NINJA==========");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Digite a opção que você deseja: ");
            resposta = dados.nextLine();

            //CONDIÇOES DO VALOR DA RESPOSTA
            switch (resposta) {

                //CADASTRAR NINJA
                case "1":
                    System.out.println("==========CADASTRANDO NINJA==========");
                    System.out.println("Escreva o nome do ninja: ");

                    for ( ; cont < cadastroNome.length; cont++) {
                        String nomeCliente = dados.nextLine();

                        //VOLTAR O MENU
                        if (nomeCliente.toUpperCase().equals("VOLTAR")) {
                            System.out.println("------------------------------------");
                            System.out.println("    VOLTANDO AO MENU!   ");
                            System.out.println("------------------------------------");
                            resposta = "2";
                            break;

                        }else {
                            cadastroNome[cont] = nomeCliente;
                            System.out.println("Nome adicionado com sucesso!");
                            System.out.println("Caso queira voltar digite 'VOLTAR' ");
                            System.out.println("Escreva de outro ninja: ");

                        }

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
                    if (cadastroNome[0] == null){
                        System.out.println("coloque um nome na lista!");
                    }
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
