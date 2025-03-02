package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        /*
        * Array = DADOS QUE ARMAZENA VARIOS VALORES EM UM UNICO ESPAÇO NA MEMORIA
        */

        String[] ninja = new String[5]; //Array String se inicializa com " NULL "
        ninja[0] = "Sasuke Uchiha";
        ninja[1] = "Naruto Uzumaki";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";
        ninja[4] = "Hinata Hyuga";
        System.out.println(ninja[0]);


        int[] idade = new int[4]; //Array INT se inicializa com " 0 "
        idade[0] = 18;
        idade[1] = 18;
        idade[2] = 18;
        idade[3] = 26;
        System.out.println(idade[0]);


        boolean[] vOUf = new boolean[2]; //Array BOLLEAN se inicializa com " FALSE "
        vOUf[0] = true;
        System.out.println(vOUf[1]);


        double[] doubleV = new double[2]; //Array DOUBLE se inicializa com " 0.0 "
        doubleV[0] = 0.1f ;
        System.out.println(doubleV[1]);



    /*  SEM ARRAY
        String ninja1 = "Naruto";
        String ninja2 = "Sasuke";
        String ninja3 = "sakura";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
    */

    }
}
