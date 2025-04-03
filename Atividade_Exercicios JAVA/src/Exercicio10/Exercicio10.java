package Exercicio10;

import java.util.Scanner;

/*Faça um algoritmo que o usuário digite o valor de mililitros (ml) e 
calcule a conversão para litros (l) e apresente o resultado na tela.*/
public class Exercicio10 {
   Scanner scanner = new Scanner(System.in);
    
   void conversao(){
       System.out.println("Digite o valor em mililitros que deseja converter: ");
       double mililitros = scanner.nextDouble();
       double litros = mililitros / 1000;
       System.out.println("O valor da conversão é: "+ litros+"l");
   }
}


