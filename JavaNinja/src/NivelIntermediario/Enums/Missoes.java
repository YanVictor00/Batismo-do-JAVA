package NivelIntermediario.Enums;

public class Missoes {
    private String name;
    private Rankdemissoes rank;

    //MÉTODOR PARA EXIBIR INFORMAÇÕES DA MISSÃO
    public void exibir(){
        System.out.println("INFORMAÇÕES DA MISSÃO");
        System.out.println("NOME: " + name + " || RANK: " + rank);
        System.out.println("DESCRIÇÃO: " + rank.getDescricao() + " || DIFICULDADE: " + rank.getDificuldade());
    }


    public Missoes(String name, Rankdemissoes rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }
    public Rankdemissoes getRank() {
        return rank;
    }

    public void setRank(Rankdemissoes rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

}
