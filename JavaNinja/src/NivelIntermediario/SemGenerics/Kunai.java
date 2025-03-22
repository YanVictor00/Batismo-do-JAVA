
//--------------------------- SEM GENERICS ---------------------------

package NivelIntermediario.SemGenerics;

public class Kunai {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kunai(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kunai: " + getName();
    }

}
