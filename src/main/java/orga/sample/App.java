package orga.sample;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Joaozinho", Arrays.asList(5.0, 7.0, 8.0)),
                new Aluno("Mariazinha", Arrays.asList(8.0, 9.0, 8.0)),
                new Aluno("Zezinho", Arrays.asList(3.0, 2.0, 1.0)));

        alunos.forEach(System.out::println);
    }
}
