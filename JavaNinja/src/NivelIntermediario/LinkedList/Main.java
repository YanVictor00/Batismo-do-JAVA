package NivelIntermediario.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> listaEncadeada = new LinkedList<>();
        listaEncadeada.add("Naruto Uzumaki");
        listaEncadeada.add("Sasuke Uchiha");
        listaEncadeada.add("Sakura Haruno");
        System.out.println(listaEncadeada);
        listaEncadeada.add(1, "Kakashi Hatake");
        listaEncadeada.remove(0);
        System.out.println(listaEncadeada);

        System.out.println("----------------------------------");

        Ninja sasuke = new Ninja("Sasuke Uchiha", 18);
        Saiajin gohan = new Saiajin("Son Gohan", 18);
        Theft kazuma = new Theft("Kazuma Satoo", 17);

        LinkedList<Object> listinha = new LinkedList<>();
        listinha.add(sasuke);
        listinha.add(gohan);
        listinha.add(kazuma);
        System.out.println(listinha);
        


    }
}
