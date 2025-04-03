
package Exercicio9;

import java.util.Scanner;



/*Faça um algoritmo que o usuário digite o 
valor de litros e calcule a conversão em mililitros e apresente o resultado na tela.
 */
public class Exercicio9 {
   Scanner scanner = new Scanner(System.in);
    
   void conversao(){
       System.out.println("Digite o valor em litros que deseja converter: ");
       double litros = scanner.nextDouble();
       double mililitros = litros * 1000;
       System.out.println("O valor da conversão é: "+ mililitros+"ml");
   }
}
