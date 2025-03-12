package NivelIntermediario.AbstracaoEPolimorfismo;

public class Uchiha extends Ninja{

    //SUBSTITUIR O MÉTODO DA CLASSE NINJA
    @Override
    public void habilidadeEspecial(String elementoEspecial) {
        habilidadeEspecial(elementoEspecial);
        System.out.println("Minha especialidade é: " + elementoEspecial);
    }

    //CONSTRUTOR
    public Uchiha(String nome){
        this.nome = nome;
    }
}
