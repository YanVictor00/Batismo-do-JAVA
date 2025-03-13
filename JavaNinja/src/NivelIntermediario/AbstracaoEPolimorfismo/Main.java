package NivelIntermediario.AbstracaoEPolimorfismo;

public class Main {
    public static void main(String[] args) {

        //OBJ NINJA NÃO PODE SER CRIADA, É UMA CLASSE ABSTRATA

        //OBJ UZUMAKI
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Konoha", "AR", 18);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        System.out.println("------------------------");

        //OBJ UCHIHA
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konoha", "FOGO", 19 );
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();


    }
}
