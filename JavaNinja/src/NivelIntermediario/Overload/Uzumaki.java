package NivelIntermediario.Overload;

import NivelIntermediario.Overload.Ninja;

public class Uzumaki extends Ninja {

    final double altura = 1.71;

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

    //OVERLOAD CONSTRUTOR
    public Uzumaki(String nome, String aldeia, String elementoEspecial, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, elementoEspecial, idade, numeroDeMissoesConcluidas, rank);
    }
}
