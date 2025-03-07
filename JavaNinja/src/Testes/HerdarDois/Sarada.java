package Testes.HerdarDois;

public class Sarada implements Sasuke, Sakura {

    @Override
    public void AtivarSharinga() {
        System.out.println("Sharingan Ativado!");
    }

    @Override
    public void SuperForca() {
        System.out.println("Poder de Força!");
    }
}
