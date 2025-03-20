package NivelIntermediario.Encapsulamento;

public abstract class Ninja {

    private String name;
    private String aldeia;
    private int idade;
    private int numeroDeMissoes;
    private final double altura = 1.80;

    public Ninja(){

    }

    public Ninja(String name, String aldeia, int idade, int numeroDeMissoes) {
        this.name = name;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public double getAltura() {
        return altura;
    }
}
