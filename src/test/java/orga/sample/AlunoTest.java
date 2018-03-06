package orga.sample;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AlunoTest {

    @Test
    public void mediaDeNotasNulas() {
        Aluno aluno = new Aluno("Nulo", null);

        assertEquals(true, Double.valueOf(0.0).equals(aluno.getMedia()));
    }

    @Test
    public void mediaDeDuasNotas() {
        Aluno aluno = new Aluno("Cinco", Arrays.asList(5.0, 5.0));

        assertEquals(true, Double.valueOf(5.0).equals(aluno.getMedia()));
    }

}