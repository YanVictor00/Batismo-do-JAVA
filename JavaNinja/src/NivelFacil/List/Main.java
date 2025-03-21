package NivelFacil.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String ninjaS = "Sasuke";

        //CRIANDO LISTA
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add(ninjaS);
        ninjasList.add("Sakura");

        //MOSTRAR TODOS OS ELEMENTOS DA LISTA
        System.out.println(ninjasList);

        //PEGAR ELEMENTO DA LISTA
        System.out.println(ninjasList.get(1));

        //REMOVER O ELEMENTO
        ninjasList.remove("Sakura");
        System.out.println(ninjasList);

        //TROCAR ELEMENTO DA LISTA
        ninjasList.set( 2 , "Hinata");
        System.out.println(ninjasList);

        //TAMANHO DA LISTA
        System.out.println(ninjasList.size());
    }
}
