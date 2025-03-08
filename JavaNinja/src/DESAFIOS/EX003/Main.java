package DESAFIOS.EX003;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Uchiha usuario = new Uchiha();
        System.out.println("======== Iremos montar um Uchiha ========");
        System.out.println("Digite o nome: ");
        usuario.nome = entrada.nextLine();
        System.out.println("Digite a idade: ");
        usuario.idade = entrada.nextInt();
        entrada.nextLine();
        usuario.missao = "Ir a porta da Aldeia e proteger a Vila da AKATSUKI";
        System.out.println(usuario.missao);
        usuario.nilvelDeDificulculdade = "S";
        usuario.statusDaMissao = "Pendente...";
        System.out.println(usuario.statusDaMissao);
        System.out.println("Qual é a habilidade Especial do Ninja: ");
        usuario.habilidadeEspecial = entrada.nextLine();
        usuario.MostrarInformacoes();
        entrada.close();
    }
}
