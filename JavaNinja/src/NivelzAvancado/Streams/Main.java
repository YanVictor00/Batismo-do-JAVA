package NivelzAvancado.Streams;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 18));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 16));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 32));
        ninjas.add(new Ninja("Gaara do Deserto", "Suna", 19));
        ninjas.add(new Ninja("Temari", "Suna", 18));
        ninjas.add(new Ninja("Kisame ne", "Nevoa", 28));

        System.out.println("LISTAR USANDO STREAM FILTER");

        String x = "Konoha";
        ninjas.stream()
                .filter(ninja -> ninja.vila().equals(x))
                .forEach(System.out::println);
        System.out.println();


        System.out.println("LISTAR USANDO STREAM SORTED (N1,N2) -> INTEGER.COMPARE");
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.idade(), n2.idade()))
                .forEach(System.out::println);


    }
}
