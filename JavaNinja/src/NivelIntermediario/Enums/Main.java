package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {

        Missoes mis = new Missoes("Capturar Gatos",Rankdemissoes.D);
        mis.exibir();
        System.out.println("----------------------------------");
        Missoes mis2 = new Missoes("Derrotar Pain", Rankdemissoes.S);
        mis2.exibir();
    }
}
