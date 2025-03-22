
//--------------------------- SEM GENERICS ---------------------------

package NivelIntermediario.SemGenerics;

import java.util.ArrayList;
import java.util.List;

public class Bolsakunai {

    private List<Kunai> kunais;

    public Bolsakunai() {
        this.kunais = new ArrayList<>();
    }

    public void AdicionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

     List<Kunai> getKunais() {
        return kunais;
    }

     void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais.toString();
    }
}
