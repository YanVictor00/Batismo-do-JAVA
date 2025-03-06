package NivelIntermediario.Objetos;

public class Main {
    public static void main(String[] args) {

        //Criando Objetos

        Ninja naruto = new Ninja();

        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Aldeia da folha";

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da folha";

        //Aplicando Métodos aos objetos

       int quantoTempoFalta = sasuke.QuantosAnosFaltaParaSeTornarHokage(50);
        System.out.println("Falta " + quantoTempoFalta + " Anos para se tornar Hokage.");

        sasuke.SharingaAtivado();

        String chamandoMetodo = sasuke.BemVindo();
        System.out.println(chamandoMetodo);





    }
}
