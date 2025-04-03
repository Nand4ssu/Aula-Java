
package Exercicio11;

import java.util.Scanner;

/*

 */
public class Exercicio11 {
  Scanner scanner = new Scanner(System.in);
    
   void conversao(){
       System.out.println("Digite o valor em metros que deseja converter: ");
       double metros = scanner.nextDouble();
       double centimetros = metros * 100;
       System.out.println("O valor da conversão é: "+ centimetros+"cm");
   }
}
