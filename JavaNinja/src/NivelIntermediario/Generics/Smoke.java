package NivelIntermediario.Generics;

public class Smoke {

    private int quantidadeS;

    public Smoke(int quantidadeS) {
        this.quantidadeS = quantidadeS;
    }

    public int getQuantidadeS() {
        return quantidadeS;
    }

    public void setQuantidadeS(int quantidadeS) {
        this.quantidadeS = quantidadeS;
    }

    public String toString() {
        return "Quantidade de Smokes: " + quantidadeS;
    }

}
