package NivelIntermediario.Objetos;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    // Método void = Método que não tem retorno.
    public void SharingaAtivado(){
        System.out.println("O Sharingan ativou!");
    }


    //Método return = Método que precisa de um retorno da tipagem do método, EX: String, int...
    public String BemVindo(){
        return "Bom dia! Seja bem vindo.";
    }

    public int QuantosAnosFaltaParaSeTornarHokage (int idadeMinima){
        return idadeMinima - idade;
    }

}
