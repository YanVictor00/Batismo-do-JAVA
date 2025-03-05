package NivelFacil.Arrays;

import java.util.Scanner;

public class RedeclaracaoArrays {
    public static void main(String[] args) {

        String[] ninja = new String[5];
        ninja[0] = "Sasuke Uchiha";
        ninja[1] = "Naruto Uzumaki";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";
        ninja[4] = "Hinata Hyuga";
        System.out.println(ninja[0]);
        System.out.println("-----HOUVE UMA REDECLARAÇÃO NO ARRAY-----");

        //REDECLARANDO ARRAY
        ninja = new String[8];
        ninja[0] = "Hashirama";
        ninja[1] = "tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }
        System.out.println("Quem será o Oitavo Hokage? :");
        Scanner teoria = new Scanner(System.in);
        String hokage8 = teoria.nextLine();

        teoria.close();
    }
}
