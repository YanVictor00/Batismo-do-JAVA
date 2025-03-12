package NivelIntermediario.AbstracaoEPolimorfismo;

public class Main {
    public static void main(String[] args) {

        //OBJ NINJA NÃO PODE SER CRIADA, É UMA CLASSE ABSTRATA

        //OBJ UZUMAKI
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki");
        naruto.habilidadeEspecial("AR");
        naruto.estrategiaDeBatalha();

        //OBJ UCHIHA
        Uchiha sasuke = new Uchiha("Sasuke Uchiha");
        sasuke.habilidadeEspecial("FOGO");
        sasuke.estrategiaDeBatalha();


    }
}
