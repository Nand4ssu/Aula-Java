
package Exercicio6;

import java.util.Scanner;

/**
Uma empresa de desenvolvimento de softwares paga a seus desenvolvedores um fixo de R$ 4500,00 por mês
mais um bônus de R$ 200,00 por bug resolvido. Faça um algoritmo que leia 
a quantidade de bugs resolvidos por um funcionário e apresente o salário do funcionário.
 */
public class Exercicio6 {
    Scanner scanner = new Scanner(System.in);
    
    double salarioFixo = 4500.00;
    double bonus = 200.00;
    double sf;
    
    void bonus(){
        System.out.println("Digite quantos bugs você resolveu: ");
        double nBugs = scanner.nextDouble();
        
        sf = salarioFixo + (nBugs * bonus);
        System.out.println(sf);
        
    }
    
}
