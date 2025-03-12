package NivelIntermediario.AbstracaoEPolimorfismo;

public class Uzumaki extends Ninja{


    //SOBREESCREVER MÉTODO DA CLASSE NINJA
    @Override
    public void habilidadeEspecial(String elementoEspecial) {
        habilidadeEspecial(elementoEspecial);
        System.out.println("Minha especialidade é: " + elementoEspecial);
    }

    //CONSTRUTOR
    public Uzumaki(String nome){
        this.nome = nome;
    }
}
