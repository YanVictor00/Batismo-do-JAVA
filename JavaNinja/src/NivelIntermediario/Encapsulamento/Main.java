package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------- NARUTO ----------- ");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 15);
        System.out.println(naruto.getName());
        naruto.setName("Narutinho, Nome alterado pelo SETTERS");
        System.out.println(naruto.getName());



        System.out.println("----------- SASUKE ----------- ");




        /*
            ENCAPSULAMENTO - GETTERS & SETTERS
        Ninja yan = new Ninja();
        yan.setName("Yan Rocha");
        System.out.println(yan.getName());
         */
    }
}
