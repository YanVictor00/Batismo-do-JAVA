package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 72;
        hashirama.vivoOuNao = false;

        Hokages tobirama = new Hokages("Tobirama Senju");
        System.out.println(tobirama.nome);

        Hokages hiruzen = new Hokages(40 );
        System.out.println("Idade do Hiruzen é " + hiruzen.idade);

        Hokages minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println("Nome:"+ minato.nome + ", idade:" + minato.idade + ", Está vivo:" + minato.vivoOuNao);

    }
}
