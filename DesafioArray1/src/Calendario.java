public class Calendario {

    static String obterNomeMes(int numeroMes) {
        String[] meses = MesesAno.NOMES_MESES;
        return meses[numeroMes - 1];
    }
}
