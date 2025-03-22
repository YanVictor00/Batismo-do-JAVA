
//--------------------------- SEM GENERICS ---------------------------

package NivelIntermediario.SemGenerics;

public class Main {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai normal");
        Kunai kunai2 = new Kunai("Kunai Explosiva");
        Kunai kunai3 = new Kunai("Kunai de Fogo");

        Bolsakunai bolsakunai = new Bolsakunai();

        bolsakunai.AdicionarKunai(kunai1);
        bolsakunai.AdicionarKunai(kunai2);
        bolsakunai.AdicionarKunai(kunai3);

        System.out.println(bolsakunai);

    }
}
