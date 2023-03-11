/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author lod17
 *
 * 1) Ler a cotação do dólar e a quantidade de dólares. Converter para real e
 * mostrar o resultado.
 *
 */
public class cotacaoDolar {

    public static void main(String[] args) {

        double cotacao, qtdeDolar, vlrFinal;

        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digte a cotacao"));
        qtdeDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dolar"));
        
        vlrFinal = cotacao * qtdeDolar;
        
        JOptionPane.showMessageDialog(null, "Voce tem: " + vlrFinal);

    }
}
