/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 11)Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
    mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
    efetuadas. Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o
    valor que ele recebe por carro vendido. Calcular e exibir o salário final do vendedor.
 * 
 */
public class SalarioFinalFuncionario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double comissaoFixa = 2;
        double comissaoCarroVendido = 5;
        double salarioFixo = 2000;
        
        double quantidadeCarroVendido, totalVendas, comissaoQuantidade, comissaoValorTotal, salarioFinal;
        
        System.out.print("Informe a quantidade de carro vendido: ");
        quantidadeCarroVendido = sc.nextDouble();
        
        System.out.print("Informe o total de suas vendas: ");
        totalVendas = sc.nextDouble();
        
        comissaoQuantidade = comissaoFixa * quantidadeCarroVendido / 100;
        
        comissaoValorTotal = comissaoCarroVendido * totalVendas / 100;
        
        salarioFinal = salarioFixo + comissaoQuantidade + comissaoValorTotal;
        
        System.out.println(salarioFinal);
        
    }
}
