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
 * 6)Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano
    tem 365 dias.
 */
public class AnosParaDias {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anos, diaAno = 365, dias;
        
        System.out.print("Quantos anos vc tem: ");
        anos = sc.nextInt();
        
        dias = anos * 365;
        
        System.out.println(dias);
        
        
    }
    
}
