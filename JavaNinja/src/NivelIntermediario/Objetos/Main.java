package NivelIntermediario.Objetos;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();

        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Aldeia da folha";

        System.out.println("Nome: " + naruto.nome);
        System.out.println("Idade: " + naruto.idade);
        System.out.println("Aldeia: " + naruto.aldeia);

    }
}
