package NivelIntermediario.Overload;

public class Main {
    public static void main(String[] args) {

        //OBJ NINJA NÃO PODE SER CRIADA, É UMA CLASSE ABSTRATA

        //OBJ UZUMAKI
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Konoha", "AR", 18, 90, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        System.out.println(naruto.altura);


        System.out.println("------------------------");

        Anbu ninjaAnbu = new Anbu();
        System.out.println(ninjaAnbu.nome);
        ninjaAnbu.idade = 14;
        System.out.println(ninjaAnbu.idade);

        System.out.println("------------------------");

        //OBJ UCHIHA
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konoha", "FOGO", 19, 91, NivelNinja.JOUNIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.About();

        System.out.println("------------------------");

        Uchiha madara =new Uchiha("Madara Uchiha", "Konoha", "TODOS", 112, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalha();
        madara.inteligenciaDeCombate(8000);



    }
}