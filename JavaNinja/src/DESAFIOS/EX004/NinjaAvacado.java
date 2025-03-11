package DESAFIOS.EX004;

public class NinjaAvacado implements Ninja{

    String nome;
    int idade;
    String habilidade;

    @Override
    public void MostrarInformacoes() {
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("ESPECILIDADE: " + especialidade);
    }

    @Override
    public void ExecutarHabilidade() {
        System.out.println("HABILIDADE ESPECIAL: " + habilidade);
    }

    String especialidade;




    public NinjaAvacado(String nome, int idade, String habilidade ,String especialidade){
        this.nome = nome;
        this.idade = idade;

        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
}
