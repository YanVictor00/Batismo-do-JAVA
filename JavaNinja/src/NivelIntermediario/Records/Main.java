package NivelIntermediario.Records;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro("Sasuke Uchiha", "sasuke@email.com", 1101);

        System.out.println(cadastro);

        System.out.println("----- SEPARADO -----");
        System.out.println(cadastro.name());
        System.out.println(cadastro.email());
        System.out.println(cadastro.telefone());

        cadastro.exibirFofo();

    }
}
