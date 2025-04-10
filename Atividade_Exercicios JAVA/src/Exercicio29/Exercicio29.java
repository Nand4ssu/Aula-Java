/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio29;

import java.util.Scanner;

/**
 *
 * @author AMANDA_4800
 */
public class Exercicio29 {
    Scanner scanner = new Scanner(System.in);
    
    void cardiaco(){
        System.out.println("Por favor, digite o valor que sua frequência cardíaca se encontra: ");
        int freqC = scanner.nextInt();
        if ( freqC < 60){
            System.out.println("BRADIQUICARDIA");
        }
        else if (freqC >= 60 || freqC <= 100){
            System.out.println("NORMOCARDIA");
        }
        else if(freqC >= 100){
            System.out.println("TAQUICARDIA");
        }
        
    }
}
