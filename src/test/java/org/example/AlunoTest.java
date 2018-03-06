package org.example;

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
        Aluno aluno5 = new Aluno("Cinco", Arrays.asList(5.0, 5.0));
        Aluno aluno2 = new Aluno("Dois", Arrays.asList(3.0, 1.0));

        assertEquals(true, Double.valueOf(5.0).equals(aluno5.getMedia()));
        assertEquals(true, Double.valueOf(2.0).equals(aluno2.getMedia()));
    }

}