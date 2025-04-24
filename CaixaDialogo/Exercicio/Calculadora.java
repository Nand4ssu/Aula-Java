package Exercicio;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        double primeiroV = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double segundoV = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:  "));

        double resultado = primeiroV + segundoV;

        JOptionPane.showMessageDialog(null, "O valor da soma é: "+ resultado);
    }
    
}
