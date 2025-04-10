/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio19;

import java.util.Scanner;

/*Construa um algoritmo que permita ao usuário digitar um valor em dólares, converta esse 
valor em reais e apresente em tela o resultado. Cotação do dólar: R$ 5.37.
 */
public class Exercicio19 {
    Scanner scanner = new Scanner(System.in);
    
    void conversao(){
       System.out.println("Digite o valor em dólares que deseja converter para reais: ");
       double dolares = scanner.nextDouble();
       double reais = dolares * 5.37;
       System.out.println("O valor da conversão é R$"+reais);
   }
}
