package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
        * Scanner = É um jeito de trazer o USUÁRIO para dentro da aplicação
        */

        //abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);


        //Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println(nomeDoNinja);
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do Ninja
        System.out.println("Escreva aqui a idade do ninja");
        short idadeDoNinja = caixaDeTexto.nextShort();
        System.out.println(idadeDoNinja);

        if (idadeDoNinja >= 18){
            System.out.println("Este Ninja é maior de idade, pode fazer qualquer missão!");
        }else {
            System.out.println("Este Ninja é menor de idade, não pode ir para missões fora da Aldeia.");
        }


        //sempre fechar o Scanner
        caixaDeTexto.close();


    }
}
