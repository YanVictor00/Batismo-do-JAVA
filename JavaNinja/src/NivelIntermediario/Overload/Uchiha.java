package NivelIntermediario.Overload;

public class Uchiha extends Ninja {

    //SUBSTITUIR O MÉTODO DA CLASSE NINJA
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque Especial");
        System.out.println("Minha especialidade é: " + elementoEspecial);
    }

    // ACESSANDO CONSTRUTOR SUPER
    public Uchiha(String nome, String aldeia, String elementoEspecial, int idade) {
        super(nome, aldeia, elementoEspecial, idade);
    }

    public Uchiha(String nome, String aldeia, String elementoEspecial, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, elementoEspecial, idade, numeroDeMissoesConcluidas, rank);
    }
}
