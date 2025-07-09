package NivelzAvancado.psvm;

public class Main {
    public static void main(String[] args) {
        //Regra: um método STATIC só pode chamar diretamente sem criar um objeto, quando o outro atributo for STATIC ex:

        //SEM STATIC
        Ninja objeto = new Ninja();
        objeto.mandarTchau();

        //COM STATIC
        Ninja.mandarOi();

    }

}
