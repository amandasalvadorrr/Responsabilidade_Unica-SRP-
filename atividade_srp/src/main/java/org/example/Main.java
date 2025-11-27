package org.example;

import org.example.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario amanda = new Funcionario("Amanda Salvador", 8000.00, "Arquiteta");

        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        RepositorioDeFuncionario repositorio = new RepositorioDeFuncionario();
        GeradorDeRelatorio relatorio = new GeradorDeRelatorio();

        System.out.println("CÁLCULO");

        double salarioLiuquidoTotal = calculadora.calcularSalarioLiquido(amanda);
        System.out.println("Salário Base Inicial de Amanda: R$" + amanda.getSalarioBase());
        System.out.println("Salário Líquido Inicial (Imposto 5%): R$" + salarioLiuquidoTotal);

        System.out.println("\nAPLICAÇÃO DE AUMENTO SALARIAL");
        amanda.setSalarioBase(9000.00);
        System.out.println("Salário Base Pós-Aumento: R$" + amanda.getSalarioBase());

        double salarioLiquidoPosAumento = calculadora.calcularSalarioLiquido(amanda);
        System.out.println("Salário Líquido Após Aumento (Imposto 10%): R$" + salarioLiquidoPosAumento);

        repositorio.salvar(amanda);

        System.out.println("\nRELATÓRIO FINAL");
        relatorio.imprimir(amanda, calculadora);
    }
}