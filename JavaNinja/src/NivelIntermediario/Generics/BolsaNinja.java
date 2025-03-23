package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    private List<T> equipamentos;

    public BolsaNinja(){
        this.equipamentos = new ArrayList<>();
    }

    void adicionarEquipamento(T equipamento){
        equipamentos.add(equipamento);
    }

    void exibirEquipamento(){
        System.out.println("-----  EQUIPAMENTOS -----");
        for (T item : equipamentos){
            System.out.println(item);
        }
    }


}
