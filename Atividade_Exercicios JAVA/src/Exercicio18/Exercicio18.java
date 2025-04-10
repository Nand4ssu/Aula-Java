/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio18;

import java.util.Scanner;

/*
 */
public class Exercicio18 {
    Scanner scanner = new Scanner(System.in);
    double saldoCliente = 2000.00;
    
    void saque(){
        System.out.println("Por favor, digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        double saldoAtual = saldoCliente - valorSaque;
        System.out.println("Seu saque foi realizado com SUCESSO! Seu saldo atual é: "+ saldoAtual);
    }
}
