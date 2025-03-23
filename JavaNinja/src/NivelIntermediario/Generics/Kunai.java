package NivelIntermediario.Generics;

public class Kunai {

    private int quantidade;

    public Kunai(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Quantidade de Kunais: " + quantidade;
    }
}
