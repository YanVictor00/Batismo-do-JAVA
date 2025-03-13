package NivelIntermediario.Overload;

public class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    String elementoEspecial;
    int idade;

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin , Chunnin, Jounnin, Hokage.

    int numeroDeMissoesConcluidas;
    NivelNinja rank;



    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque Especial");
    };

    //SOBREESCREVENDO MÉTODO DA INTERFACE NA CLASSE ABSTRATA
    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Essa é a minha estratégia de Batalha");
    };

    //CONSTRUTOR NA SUPERCLASSE
    public Ninja(String nome, String aldeia, String elementoEspecial, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.elementoEspecial = elementoEspecial;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando novos atributos
    public Ninja(String nome, String aldeia, String elementoEspecial, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome,aldeia,elementoEspecial,idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }
}
