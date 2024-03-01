import com.algaworks.Funcionario;
import com.algaworks.Holerite;
import com.algaworks.Programador;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 30);
        System.out.println(funcionario1);

        Holerite holerite1 = funcionario1.gerarHolerite(44, "jan/2024");
        holerite1.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Maria", 40);
        programador1.setValorBonus(200);
        System.out.println(programador1);

        Holerite holerite2 = programador1.gerarHolerite(44, "jan/2024");
        holerite2.imprimir();
    }
}
