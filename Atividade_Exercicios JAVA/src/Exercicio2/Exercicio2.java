
package Exercicio2;

public class Exercicio2 {
    //Construa um algoritmo para calcular o total gasto por mês com transporte coletivo (metrô). 
    //Imagine que são utilizadas 4 conduções por dia e que o valor de cada condução é de R$ 5,20. Considere o mês com 30 dias. 
    //Apresente no final o valor gasto com conduções no mês.
    double conducao = 5.20;
    
    void calcularDia(){
        
    double valorConducaoDia = conducao * 4;
        System.out.println("O valor gasto com condução por dia é: "+ valorConducaoDia);
        
    double totalMes = valorConducaoDia * 30;
        System.out.println("O valor gasto com condução no mês é: R$ "+ totalMes);
    
    }
    
    
    
    
    
}
