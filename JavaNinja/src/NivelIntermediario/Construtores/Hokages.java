package NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    // NoArgs Constructor
    public Hokages(){

    }

    //Construtor com Argumentos!
    public Hokages(String nome){
        this.nome = nome;
    }
    //Construtor com Argumentos!
    public Hokages(int idade){
        this.idade = idade;
    }

    // All Args Constructor  =  Construtor com Argumentos!  -->> Tecla Atalho: ( Alt + Insert )
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }



}
