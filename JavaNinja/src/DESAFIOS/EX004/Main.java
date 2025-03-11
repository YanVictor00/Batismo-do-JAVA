package DESAFIOS.EX004;

public class Main {
    public static void main(String[] args) {


        NinjaBasico narutinho = new NinjaBasico();
        narutinho.nome = "Naruto Uzumak";
        narutinho.idade =18;
        narutinho.MostrarInformacoes();
        narutinho.ExecutarHabilidade();

        System.out.println("============================");

        NinjaAvacado sasukinho = new NinjaAvacado("Rinnegan: Amenotejikara (ninjutsu espaço-temporal)", TipoHabilidade.TAIJUTSU.type);
        sasukinho.nome = "Sasuke Uchiha";
        sasukinho.idade = 19;
        sasukinho.MostrarInformacoes();
        sasukinho.ExecutarHabilidade();
    }
}
