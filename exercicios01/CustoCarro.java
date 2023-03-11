/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 10)O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
    distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
    seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro, calcular e escrever o custo final
    ao consumidor.
 */
public class CustoCarro {
            
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double percentualDistribuidor = 28;
        double impostos = 45;
        double custoFabrica, custoDistribuidor, custoImposto, precoFinal;
        
        System.out.print("Informe o custo de fabrica: ");
        custoFabrica = sc.nextDouble();
        
        custoDistribuidor = custoFabrica * percentualDistribuidor / 100;
        custoImposto = custoFabrica * impostos / 100;
        precoFinal = custoDistribuidor + custoImposto + custoFabrica;
        
        System.out.println(precoFinal);   
    }
}
