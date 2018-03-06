package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas == null ? new ArrayList<>() : notas;
    }

    public Double getMedia() {
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return nome + " " + getMedia() + " " + getStatus();
    }

    private String getStatus() {
        return getMedia() >= 6 ? "Aprovado(a)" : "Reprovado(a)";
    }
}
