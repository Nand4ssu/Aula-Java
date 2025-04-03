
package Exercicio4;

import java.util.Scanner;

/**
Faça um algoritmo que solicite ao usuário o seu peso. O programa deve calcular e apresentar a quantidade de 
 água, em litros, que deve ser ingerida ao longo de um dia. A formula é: qtdAgua = peso * 0.040.
 */
public class Exercicio4 {
    Scanner x = new Scanner(System.in);
    
    void calculoPeso(){
        System.out.println("Qual é o seu peso?: ");
        int peso = x.nextInt();
        double qtdAgua = peso * 0.040;
        System.out.println("Você deve beber por volta de "+ qtdAgua +"l por dia.");
        
    }
}
