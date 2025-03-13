package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements Sharingan , Anbu{

    public void BoasVindas(){
        System.out.println( nome + ": Eu sou do Clã Hatake");
    }

    //ESSE MÉTODO VEM DA INTERFACE.
    @Override
    public void AtivarSharingan() {
        System.out.println(nome + ": Ativou o Sharingan!");
    }

    //ESSE MÉTODO VEM DE OUTRA INTERFACE
    public void NinjaDeElite(){
        System.out.println(nome + ": Eu sou um Ninja de Elite da ANBU");
    }

}
