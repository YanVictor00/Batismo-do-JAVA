package Testes.Review.Ex001;

public record Ninja(String nome, int idade, String missão, int niveldedificuldade) {

    public void mostrar(){
        System.out.println("NOME: "+ nome);
        System.out.println("IDADE: "+ idade);
        System.out.println("MISSÃO: "+ missão);
        System.out.println("NIVEL: "+ niveldedificuldade);
    }
}
