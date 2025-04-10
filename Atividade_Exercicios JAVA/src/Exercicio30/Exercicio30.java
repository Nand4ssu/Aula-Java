/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio30;

import java.util.Scanner;

/*
 */
public class Exercicio30 {
    Scanner scanner = new Scanner(System.in);
    
    void respiracao(){
        System.out.println("Por favor, digite o valor que sua frequência respiratória se encontra: ");
        int freqRes = scanner.nextInt();
        if ( freqRes < 12){
            System.out.println("BRADIPINEIA");
        }
        else if (freqRes >= 60 || freqRes <= 100){
            System.out.println("EUPINEIA");
        }
        else if(freqRes >= 100){
            System.out.println("TAQUIPINEIA");
        }
        
    }
}
