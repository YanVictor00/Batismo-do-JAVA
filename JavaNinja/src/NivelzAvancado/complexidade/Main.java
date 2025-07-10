package NivelzAvancado.complexidade;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 18099999; i++){

        linkedList.add(i);
        arrayList.add(i);
        }



        inicio = System.nanoTime();
        arrayList.add(9000);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo do ArrayList: " + tempo + " ns");


        inicio = System.nanoTime();
        linkedList.add(9000);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo do LinkedList: " + tempo + " ns");
    }
}
