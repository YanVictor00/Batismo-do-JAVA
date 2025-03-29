package NivelIntermediario;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class TreeSetxLinkedHashSet {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Yan");
        lista.add("Yasmim");
        lista.add("Raphael");
        lista.add("BOLT");
        lista.add("BOLT");
        System.out.println("Aceita valores duplicados e index, é organizado de acordo com index!");
        System.out.println( "LinkedList -> " + lista + "\n");

        Set<String> setLista = new HashSet<>();
        setLista.addAll(lista);
        System.out.println("Organiza de forma Alfabética ou Númerica, não aceita valores duplicados");
        System.out.println("TreeSet -> " + setLista + "\n");

        Set<String> setListaLHS = new LinkedHashSet<>();
        setListaLHS.addAll(lista);
        System.out.println("Organiza da forma que foi implementado, não aceita valores duplicados");
        System.out.println("LinkedHashSet -> " + setListaLHS + "\n");

    }
}
