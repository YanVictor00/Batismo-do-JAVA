package NivelIntermediario.AbstracaoEPolimorfismo;
public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    String elementoEspecial;
    int idade;

    public void habilidadeEspecial(String elementoEspecial){
            System.out.println("Meu nome é " + nome + " e esse é meu Ataque Especial");
    };

    //SOBREESCREVENDO MÉTODO DA INTERFACE NA CLASSE ABSTRATA
    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Essa é a minha estratégia de Batalha");
    };

}
