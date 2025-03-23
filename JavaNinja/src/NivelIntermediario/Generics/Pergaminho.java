package NivelIntermediario.Generics;

public class Pergaminho {

    private String name;

    public Pergaminho(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pergaminho: " + name;
    }

}
