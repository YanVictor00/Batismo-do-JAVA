package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
         * Ternários = São maneiras de reduzir o código
         *
         * Variável = ( Condição) ? Condição verdadera : Condição Falsa;
         */

        short numeroDeMissoes = 1;
        String nivel;

        nivel = (numeroDeMissoes >= 10) ? "VOCÊ TEM MAIS DE 10 MISSOES" : "VOCÊ TEM MENOS DE 10 MISSOES";
        System.out.println(nivel);

    }
}