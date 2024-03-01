package com.algaworks;

public record Holerite (String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println("---------- Holerite -----------");
        System.out.printf("Funcionário: %s%n", nome());
        System.out.printf("Mês/Ano: %s%n", mesAno());
        System.out.printf("Salário recebido: %.2f%n", valorSalario());
    }
}
