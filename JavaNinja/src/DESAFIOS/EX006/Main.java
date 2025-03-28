package DESAFIOS.EX006;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();
        Ninja naruto = new Ninja("Naruto Uzumaki", 17, "Aldeia da folha");
        listaDeNinjas.add(naruto);
        Ninja sasuke = new Ninja("Sasuke Uchiha", 18, "Aldeia da folha");
        listaDeNinjas.add(sasuke);
        Ninja sakura = new Ninja("Sakura Haruno", 18, "Aldeia da folha");
        listaDeNinjas.add(sakura);
        Ninja kakashi = new Ninja("Kakashi Hatake", 32, "Aldeia da folha");
        listaDeNinjas.add(kakashi);
        Ninja gaara = new Ninja("Gaara do Deserto", 19, "Aldeia da Areia");
        listaDeNinjas.add(gaara);
        Ninja yan = new Ninja("Yan Uchiha", 18, "Aldeia da folha");
        listaDeNinjas.add(yan);
        Ninja itachi = new Ninja("Itachi Uchiha", 28, "Aldeia da folha");
        listaDeNinjas.add(itachi);



        while (true){
            System.out.println("------------- MENU -------------");
            System.out.println("1 - EXIBIR LISTA COMPLETA");
            System.out.println("2 - EXIBIR UMA POSIÇÃO DA LISTA ");
            System.out.println("3 - REMOVER");
            System.out.println("4 - ADICIONAR");
            System.out.println("5 - SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            int opcao = entrada.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println(listaDeNinjas);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("ESCOLHA A POSIÇÃO: ");
                    int posicao = entrada.nextInt() - 1;

                    if (posicao >= 0 && posicao <= 6){
                        System.out.println(listaDeNinjas.get(posicao));
                        System.out.println();
                    }
                    else{
                        System.out.println("Escolha uma posição de 1 a 7.");
                    }

                    break;

                case 3:
                    System.out.println("caso 3");
                    break;

                case 4:
                    System.out.println("caso 4");
                    break;

                case 5:
                    System.out.println("SYSTEM FINALIZED...");
                    entrada.close();
                    System.exit(0);
                    break;

                default:

                    System.out.println("Opção invalida...");
                    System.out.println();

            }


        }


    }
}
