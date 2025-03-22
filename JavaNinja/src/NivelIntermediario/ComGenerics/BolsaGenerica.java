package NivelIntermediario.ComGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos;

    //COLOCAR EQUIPAMENTOS GENÉRICOS
    public void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    //CONSTRUTOR MUIT IMPORTANTE!
    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "BolsaGenerica: " + equipamentos.toString();
    }
}
