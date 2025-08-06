/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelsetpa;

import javax.swing.*;


/**
 *
 * @author FATEC ZONA LESTE
 */
public class IfElseTPA {

    public static void main(String[] args) {
  
        // Pede para o usuário digitar o primeiro número
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        // Pede para o usuário digitar o segundo número
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converte os textos digitados para números inteiros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Variável para armazenar o resultado
        String resultado = "";

        // Comparações utilizando IF/ELSE e operadores relacionais
        if (num1 == num2) {
            resultado += "Os números são IGUAIS.\n";
        } else if (num1 > num2) {
            resultado += "Número 1 é MAIOR que Número 2.\n";
        } else {
            resultado += "Número 1 é MENOR que Número 2.\n";
        }

        if (num1 != num2) {
            resultado += "Os números são DIFERENTES.\n";
        }

        if (num1 >= num2) {
            resultado += "Número 1 é MAIOR ou IGUAL a Número 2.\n";
        }

        if (num1 <= num2) {
            resultado += "Número 1 é MENOR ou IGUAL a Número 2.\n";
        }

        // Exibe o resultado em uma janela de mensagem
        JOptionPane.showMessageDialog(null, resultado);

    }
}
