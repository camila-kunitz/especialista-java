import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

//        for (int i = 0; i < alunos.size(); i++) {
//            String aluno =  alunos.get(i);
//            System.out.println(aluno);
//
//        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }


//        String[] alunos = new String[2];
//        alunos[0] = "João";
//        alunos[1] = "Maria";

//        for (int i = 0; i < alunos.length; i++) {
//            String aluno =  alunos[i];
//            System.out.println(aluno);
//
    }
}
