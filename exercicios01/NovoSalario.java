/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 9)Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do
    novo salário.
 * 
 */
public class NovoSalario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salario, percentualReajuste, novoSalario;
        
        System.out.print("Informe seu salario: ");
        salario = sc.nextDouble();
        
        System.out.print("Informe o reajuste: ");
        percentualReajuste = sc.nextDouble();
        
        novoSalario = salario + (percentualReajuste * salario) / 100;
        
        System.out.printf("Seu novo salario e: %s \n",novoSalario);
    }
    
}
