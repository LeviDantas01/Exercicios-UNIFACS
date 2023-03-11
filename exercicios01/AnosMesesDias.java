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
 * 7)Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa expressa
    apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
public class AnosMesesDias {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idadeAno, idadeMes, idadeDias, totalDiasAno, totalDiasDoMes, idadeFinal;
        int quantidadeDiasAnos = 365;
        int quantidadeDiasMes = 30;
        
        System.out.print("Infome sua idade em anos: ");
        idadeAno = sc.nextInt();
        
        System.out.print("Infome a quantdade de meses: ");
        idadeMes = sc.nextInt();
        
        System.out.print("Informe a quantidade em dias: ");
        idadeDias = sc.nextInt();
        
        totalDiasAno = idadeAno * quantidadeDiasAnos;
        totalDiasDoMes = idadeMes * quantidadeDiasMes;
        
        idadeFinal = totalDiasAno + totalDiasDoMes + idadeDias;
        
        System.out.printf("Sua idade total é: %s \n", idadeFinal);
        
        
        
    }
    
}
