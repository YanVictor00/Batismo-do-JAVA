package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> FilaQueue = new LinkedList<>();

        FilaQueue.add("Sasuke Uchiha");
        FilaQueue.add("Naruto Uzumaki");
        FilaQueue.add("Sakura Haruno");
        System.out.println("Queue: " + FilaQueue);

        FilaQueue.poll();
        System.out.println(".poll() = remover: " + FilaQueue);

        System.out.println("Mostrar o HEAD: " + FilaQueue.peek());

        FilaQueue.poll();
        FilaQueue.poll();
        if (FilaQueue.isEmpty()){
            System.out.println("A fila está vazia! Por Favor, coloque um elemento.");
        }

    }
}
