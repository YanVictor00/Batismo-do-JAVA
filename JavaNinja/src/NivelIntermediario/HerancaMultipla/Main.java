package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        //OBJ UCHIHA
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.AtivarSharingan();
        System.out.println("--------------------");

        //OBJ HATAKE
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 32;
        kakashi.BoasVindas();
        kakashi.AtivarSharingan();
        kakashi.NinjaDeElite();

    }
}
