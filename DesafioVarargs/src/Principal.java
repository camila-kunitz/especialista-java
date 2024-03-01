public class Principal {
    public static void main(String[] args) {

//        CalcularMediaNumeros calcularMediaNumeros = new CalcularMediaNumeros();
//        calcularMediaNumeros.calcularMedia(5, 4);
//        System.out.println(calcularMediaNumeros.toString());


        double media = CalcularMediaNumeros.calcularMedia(59.2, 89.2,
                10.2, 104.2, 78);
        System.out.printf("Média: %.2f%n", media);

    }
}
