package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um Personagem: ");
        System.out.println("1 - Naruto Uzumak");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.println("Escolha o número do personagem: ");
        short personagemEscolhido = scanner.nextShort();
        System.out.println(personagemEscolhido);

        switch (personagemEscolhido){
            case 1 -> System.out.println("Você escolheu Naruto Uzumak");
            case 2 -> System.out.println("Você escolheu Sasuke Uchiha");
            case 3 -> System.out.println("Você escolheu Sakura Haruno");
            default -> System.out.println("Você não escolheou o personagem!");
        }




        scanner.close();
    }
}
