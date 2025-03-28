package Testes;

import Testes.HerdarDois.Ninja;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> lista = new LinkedList<>();
        Ninja naruto = new Ninja("Naruto Uzumaki",18,"Aldeia da Folha");
        lista.add(naruto);
        Ninja sasuke = new Ninja("Sasuke Uchiha",18,"Aldeia da Folha");
        lista.add(sasuke);

        System.out.println(lista.get(1));

    }
}
