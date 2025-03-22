package NivelIntermediario.ComGenerics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaNinja = new BolsaGenerica<>();
        bolsaNinja.adicionarEquipamentos(kunai);
        bolsaNinja.adicionarEquipamentos(shuriken);
        bolsaNinja.adicionarEquipamentos(pergaminho);
        System.out.println(bolsaNinja);


    }
}
