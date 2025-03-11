package DESAFIOS.EX004;

public class Main {
    public static void main(String[] args) {

        NinjaBasico narutinho = new NinjaBasico("Naruto Uzumak", 18);
        narutinho.MostrarInformacoes();
        narutinho.ExecutarHabilidade();

        System.out.println("============================");

        NinjaAvacado sasukinho = new NinjaAvacado("Sasuke Uchiha", 19,"Rinnegan: Amenotejikara (ninjutsu espaço-temporal)", TipoHabilidade.RINNEGAN.type);
        sasukinho.MostrarInformacoes();
        sasukinho.ExecutarHabilidade();
    }
}
