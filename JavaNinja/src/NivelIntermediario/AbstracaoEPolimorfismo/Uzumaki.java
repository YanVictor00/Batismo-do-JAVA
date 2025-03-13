package NivelIntermediario.AbstracaoEPolimorfismo;

public class Uzumaki extends Ninja{

    //SOBREESCREVER MÉTODO DA CLASSE NINJA
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque Especial");
        System.out.println("Minha especialidade é: " + elementoEspecial);
    }

    // ACESSANDO CONSTRUTOR SUPER
    public Uzumaki(String nome, String aldeia, String elementoEspecial, int idade) {
        super(nome, aldeia, elementoEspecial, idade);
    }
}
