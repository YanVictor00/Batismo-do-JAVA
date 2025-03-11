package DESAFIOS.EX004;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;

    @Override
    public void MostrarInformacoes() {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
    }

    @Override
    public void ExecutarHabilidade() {
        System.out.println("Sem Habilidade Especial!");
    }
}
