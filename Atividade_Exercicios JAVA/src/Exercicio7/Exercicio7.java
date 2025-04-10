/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio7;

import java.util.Scanner;

/**
 *
 * @author AMANDA_4800
 */
public class Exercicio7 {
    Scanner scanner = new Scanner(System.in);
    
    double salarioFixo = 2000.00;
    double bonus = 100.00;
    double sf;
    
    void bonus(){
        System.out.println("Digite quantos carros a vista você vendeu: ");
        double nCars = scanner.nextDouble();
        
        sf = salarioFixo + (nCars * bonus);
        System.out.println(sf);
        
    }
}
