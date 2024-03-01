import java.util.Arrays;
import java.util.Comparator;

public class Principal5 {
    public static void main(String[] args) {

        int[] notas = {8, 5, 4, 10, 9};
        Arrays.sort(notas);     // ordena os numeros do arrey;


     //   Integer[] notas = {8, 5, 4, 10, 9};
     //   Arrays.sort(notas, Comparator.reverseOrder());     // Ordem decrescente dos números


        System.out.println(Arrays.toString(notas));
    }
}
