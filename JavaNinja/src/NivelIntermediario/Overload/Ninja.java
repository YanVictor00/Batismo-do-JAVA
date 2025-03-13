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


                    //MÉTODOS

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque Especial");
    };

    public void About(){
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + aldeia);
        System.out.println("ELEMENTO: " + elementoEspecial);
        System.out.println("IDADE: " + idade);
        System.out.println("MISSÕES CONCLUÍDAS: " + numeroDeMissoesConcluidas);
        System.out.println("RANK: " + rank);
    };

    public void inteligenciaDeCombate(){
        System.out.println("Você tem inteligencia de combate?");
    }

    // Método Overload
    public void inteligenciaDeCombate(int qi){
        if (qi > 150) {
            System.out.println("Você é um Ninja muito inteligente");
        } else if (qi >= 120) {
            System.out.println("Você é um Ninja Promissor");
        }else {
            System.out.println("Você precisa ganhar mais experiência");
        }
    }


                    // CONSTRUTORES

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
