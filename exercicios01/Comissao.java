/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lod17
 * 
 * 3)Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua
    comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e
    quantidade vendida.
 */
public class Comissao {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double comissao = 5;
        double precoUnitario, quantidadeVendida, valorAReceber;
                
        
        System.out.println("Vamos Calcular sua comissão: ");
        
        System.out.print("Informe o preço total de suas vendas: ");
        precoUnitario = sc.nextDouble();
        
        System.out.print("Infome a quantidade em peças vendidas: ");
        quantidadeVendida = sc.nextDouble();
        
        valorAReceber = (precoUnitario * quantidadeVendida * comissao) / 100;
        
        System.out.printf("Sua comissão sera de %s",valorAReceber);
        
        
    }
    
}
