package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //POLIMORFISMO

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.HabilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.HabilidadeEspecial();

    }
}
