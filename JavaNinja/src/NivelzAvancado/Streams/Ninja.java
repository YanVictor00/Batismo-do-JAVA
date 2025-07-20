package NivelzAvancado.Streams;

public record Ninja(String nome, String vila, int idade) {

    @Override
    public String toString() {
        return "Nome:" + nome + " | " + "Idade: " + idade + " | " + "Vila: " + vila;
    }
}
