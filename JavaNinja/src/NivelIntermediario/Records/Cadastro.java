//      -!- COM RECORD -!-

package NivelIntermediario.Records;
public record Cadastro(String name, String email, int telefone) {
    void exibirFofo(){
        System.out.println("----- CADASTRO -----");
        System.out.println("Nome:" + name.toUpperCase());
        System.out.println("Email: " +email.toUpperCase());
        System.out.println("Contato: " +telefone);
    }
}
