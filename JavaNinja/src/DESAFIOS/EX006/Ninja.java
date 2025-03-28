package DESAFIOS.EX006;

public record Ninja(String nome, int idade, String aldeia) {
    @Override
    public String toString() {
        return  "[ NOME: "+ nome + ", IDADE: " + idade + ", ALDEIA: " + aldeia + " ]\n";
    }
}
