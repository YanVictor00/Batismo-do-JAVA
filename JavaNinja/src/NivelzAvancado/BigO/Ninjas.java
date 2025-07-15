package NivelzAvancado.BigO;

import NivelzAvancado.psvm.Ninja;

public class Ninjas {

    String nome;
    int idade;

    public Ninjas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninjas{" +
                "Nome= '" + nome + '\'' +
                ", Idade= " + idade +
                '}';
    }
}
