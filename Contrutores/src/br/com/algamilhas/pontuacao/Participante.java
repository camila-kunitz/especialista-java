package br.com.algamilhas.pontuacao;

import java.util.Objects;

public class Participante {

    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        this.nome = nome;
    }

    private Participante(String nome, int saldoDePontos) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (saldoDePontos < 0) {
            throw new IllegalArgumentException("Saldo inicial de pontos não pode ser negativo");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    public void creditarPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Pontos a creditar não pode ser negativo");
        }

        this.saldoDePontos += pontos;

        // this.saldoDePontos += pontos;
        }
    }


