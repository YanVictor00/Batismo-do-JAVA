package DESAFIOS.EX006;

public record Ninja(String nome, int idade, String aldeia) {
    @Override
    public String toString() {
        return  nome + " - " + idade + " - " + aldeia + "]";
    }
}
