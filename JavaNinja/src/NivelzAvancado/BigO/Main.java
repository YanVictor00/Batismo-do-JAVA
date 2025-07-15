package NivelzAvancado.BigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Ninjas> ninjas = new ArrayList<Ninjas>();
        ninjas.add(new Ninjas("Naruto", 18));
        ninjas.add(new Ninjas("Sasuke", 18));
        ninjas.add(new Ninjas("Sakura", 18));


        // ALGORITMO - O(1) - COMPLEXIDADE CONSTANTE
        System.out.println(ninjas.get(2));
        System.out.println();

        // ALGORITMO - O(n) - COMPLEXIDADE LINEAR
        /* for (Ninjas ninja : ninjas){
            System.out.println(ninja);
        }*/

        // ALGORITMO - O(n²) - COMPLEXIDADE QUADRÁTICA
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {

                System.out.println(ninjas.get(i) + " vs " + ninjas.get(j));

            }
        }


    }
}
