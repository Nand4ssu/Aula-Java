package Aula_revisao;



public class Aula_Revisao_1203 {

  
    public static void main(String[] args) {
        
        Caneta bic = new Caneta();
        Caneta bic2 = new Caneta();
        
        bic2.cor= "Preta";
        bic2.modelo = "Compacta";
        bic2.carga = 90;
        bic2.ponta = 0.9;
        bic2.mostrar();
        
        System.out.println("==================");
        
        bic.cor = "Azul";
        bic.modelo = "Compacta";
        bic.carga = 80;
        bic.ponta = 0.7;
        bic.mostrar();
        
        System.out.println("================");
        //System.out.println(bic.cor+"\n"+bic.modelo+"\n"+bic.carga+"\n"+bic.ponta);
        //Atividade em aula
        
        Carro carroA = new Carro();
        Carro carroB = new Carro ();
        
        carroA.cor= "Rosa";
        carroA.marca = "Mercedes";
        carroA.modelo = "AMG A 35 4MATIC";
        carroA.combustivel = "Diesel";
        carroA.mostrar();
        
        System.out.println("==============");
        
        carroB.combustivel = "Gasolina";
        carroB.cor = "Preto";
        carroB.marca = "Honda";
        carroB.modelo = "Civic";
        carroB.mostrar();
    }
    
}
