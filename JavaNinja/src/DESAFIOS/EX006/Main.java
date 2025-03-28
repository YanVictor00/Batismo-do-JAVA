package DESAFIOS.EX006;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Aldeia da folha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 18, "Aldeia da folha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 18, "Aldeia da folha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 32, "Aldeia da folha"));
        listaDeNinjas.add(new Ninja("Gaara do Deserto", 19, "Aldeia da Areia"));
        listaDeNinjas.add(new Ninja("Yan Uchiha", 18, "Aldeia da folha"));
        listaDeNinjas.add(new Ninja("Itachi Uchiha", 28, "Aldeia da folha"));

        while (true){
            System.out.println("------------- MENU -------------");
            System.out.println("1 - EXIBIR LISTA COMPLETA");
            System.out.println("2 - EXIBIR UMA POSIÇÃO DA LISTA ");
            System.out.println("3 - REMOVER");
            System.out.println("4 - ADICIONAR");
            System.out.println("5 - SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("------------- LISTA NINJA -------------");
                    System.out.println(listaDeNinjas);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("ESCOLHA A POSIÇÃO: ");
                    int posicao = entrada.nextInt() - 1;
                    entrada.nextLine();
                    if (posicao >= 0 && posicao <= 6){
                        System.out.println();
                        System.out.println("LISTA/POSIÇÃO: " + (posicao+1));
                        System.out.println(listaDeNinjas.get(posicao));
                        System.out.println();
                    }
                    else{
                        System.out.println("Escolha uma posição de 1 a 7.");
                    }
                    break;
                case 3:
                    if (!listaDeNinjas.isEmpty()) {
                        System.out.println("REMOVENDO O HEAD DA LISTA");
                        System.out.println(listaDeNinjas.remove());
                    }
                    else{
                        System.out.println("    # A LISTA ESTÁ CHEIA! ADICIONE UM VALOR NA LISTA! #");
                    }
                    break;
                case 4:
                    System.out.println("PARA ADICIONAR UM ELEMENTO NA LISTA COMPLETE.");
                    System.out.println("NOME: ");String nome = entrada.nextLine();
                    System.out.println("IDADE: ");int idade = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("ALDEIA: ");String aldeia = entrada.nextLine();
                    listaDeNinjas.add(new Ninja(nome,idade,aldeia));
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
