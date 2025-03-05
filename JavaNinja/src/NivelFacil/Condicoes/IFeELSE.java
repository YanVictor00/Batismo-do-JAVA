package NivelFacil.Condicoes;

public class IFeELSE {
    public static void main(String[] args) {

        // Ninja Naruto
        String name = "Naruto Uzamak";
        String rank;
        int idade = 16;
        boolean isHokage = false;
        short quantidadeDeMissoes = 5;

        if (quantidadeDeMissoes >= 10 && idade > 15){
            rank = "CHUNNIN";
            System.out.println(rank);
        } else if (quantidadeDeMissoes >= 20) {
            rank = "JOUNIN";
            System.out.println(rank);
        } else {
            rank = "GENNIN";
            System.out.println(rank);
        }


    }
}
