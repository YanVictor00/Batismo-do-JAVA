package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsa = new BolsaNinja<>();

        bolsa.adicionarEquipamento(new Smoke(3));
        bolsa.adicionarEquipamento(new Kunai(10));
        bolsa.adicionarEquipamento(new Pergaminho("Invocação"));

        bolsa.exibirEquipamento();

    }
}
