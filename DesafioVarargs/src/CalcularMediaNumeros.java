import java.util.Arrays;

public class CalcularMediaNumeros {

   static double calcularMedia(double numero1, double numero2, double... demaisNumeros) {
       double[] todosNumeros = Arrays.copyOf(demaisNumeros, demaisNumeros.length + 2);
       todosNumeros[todosNumeros.length - 2] = numero1;
       todosNumeros[todosNumeros.length - 1] = numero2;


       double media = 0;

       for (double numero : demaisNumeros) {
           media+= numero;
       }

         return media/demaisNumeros.length;
    }
}
