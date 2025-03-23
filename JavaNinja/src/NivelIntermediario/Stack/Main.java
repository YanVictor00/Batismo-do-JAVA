package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // ARRAY
        String[] NinjaArray = new String[3];

        // LIST
        List<String> NinjaList = new ArrayList<>();

        // STACK
        Stack<String> NinjaStack = new Stack<>();

        NinjaStack.push("Yan");
        NinjaStack.push("Sasuke");
        NinjaStack.push("Kakashi");

        System.out.println("Valores da Stack: " + NinjaStack);
        NinjaStack.pop();
        System.out.println(".pop() Aplicado na Stack: " + NinjaStack);
        System.out.println("Utilizando o .peek() na Stack: " + NinjaStack.peek());
        System.out.println("Tamanho de elemento da Stack: " + NinjaStack.size());

        /*
        PENSEI EM UMA ESPÉCIE DE LIXEIXA
        String a1 = "Yan";
        String a2 = a1;
        a1 = Null;
        System.out.println(a2 + " e " + a1);
        */
    }
}
