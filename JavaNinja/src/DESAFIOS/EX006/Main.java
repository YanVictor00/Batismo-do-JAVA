package DESAFIOS.EX006;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();
        Ninja naruto = new Ninja("Naruto Uzumaki", 17, "Aldeia da folha");
        Ninja sasuke = new Ninja("Sasuke Uchiha", 18, "Aldeia da folha");
        Ninja sakura = new Ninja("Sakura Haruno", 18, "Aldeia da folha");
        Ninja kakashi = new Ninja("Kakashi Hatake", 32, "Aldeia da folha");
        Ninja gaara = new Ninja("Gaara do Deserto", 19, "Aldeia da Areia");
        Ninja yan = new Ninja("Yan Uchiha", 18, "Aldeia da folha");
        Ninja itachi = new Ninja("Itachi Uchiha", 28, "Aldeia da folha");
        listaDeNinjas.add(naruto);
        listaDeNinjas.add(sasuke);
        listaDeNinjas.add(sakura);
        listaDeNinjas.add(kakashi);
        listaDeNinjas.add(gaara);
        listaDeNinjas.add(yan);
        listaDeNinjas.add(itachi);

        for (int number : listaDeNinjas){

        }

    }
}
