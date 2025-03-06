package NivelIntermediario.Objetos;

public class Main {
    public static void main(String[] args) {

        //Criando Objetos

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Aldeia da folha";

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da folha";

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Onegai";
        sakura.idade = 19;
        sakura.aldeia = "Aldeia da folha";

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 18;
        hinata.aldeia = "Aldeia da folha";



        //Aplicando Métodos aos objetos

        sasuke.SharingaAtivado();
        naruto.GrandeQuantideDeChakra();
        sakura.EuCuro();
        hinata.Byakugan();







    }
}
