package NivelIntermediario.Hashset;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> listaList = new ArrayList<>();
        listaList.add("A");
        listaList.add("B");
        listaList.add("C");
        listaList.add("B");
        System.out.println(listaList);


        Set<String> SetRecList = new HashSet<>();
        SetRecList.addAll(listaList);
        System.out.println(SetRecList);


        Set<String> listaSet = new HashSet<>();
        listaSet.add("Silvio Santos");
        listaSet.add("Vasco da Gama");
        listaSet.add("Cachorro Chupetão");
        System.out.println(listaSet);
        listaSet.remove("Silvio Santos");
        System.out.println(listaSet);

    }
}
