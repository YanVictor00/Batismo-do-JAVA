package DESAFIOS.EX003;
import NivelIntermediario.Objetos.Ninja;
public class Uchiha extends Ninjas {
    String habilidadeEspecial;
    @Override
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Sua Habilidade Especial é: "+ habilidadeEspecial);
    }
}
