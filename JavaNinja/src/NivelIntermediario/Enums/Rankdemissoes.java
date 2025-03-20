package NivelIntermediario.Enums;

public enum Rankdemissoes {

    D("Baixa", 2),
    C("Média", 4),
    B("Média alta", 6),
    A("Alta", 8),
    S("Impossível", 10);

    private String descricao;
    private int dificuldade;

     Rankdemissoes(String descricao, int dificuldade){
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
