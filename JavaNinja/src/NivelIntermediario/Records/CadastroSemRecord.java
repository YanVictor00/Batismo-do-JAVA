
//      -!- SEM UTILIZAR RECORD -!-

package NivelIntermediario.Records;
import java.util.Objects;

public class CadastroSemRecord {

    private final String name;
    private final String email;
    private final int telefone;

    public CadastroSemRecord(String name, String email, int telefone) {
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    void exibirFofo(){
        System.out.println("----- CADASTRO -----");
        System.out.println("Nome:" + name.toUpperCase());
        System.out.println("Email: " + email.toUpperCase());
        System.out.println("Contato: " + telefone);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CadastroSemRecord that = (CadastroSemRecord) o;
        return telefone == that.telefone && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, telefone);
    }

    @Override
    public String toString() {
        return "CadastroSemRecord{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
