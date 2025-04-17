package Calculo;


public class Calculo {

    double valor1;
    double valor2;
    double resultado;

    public void somar(){
        double x = getValor1();
        double y =getValor2();
        resultado = x + y;

        System.out.println("O resultado da soma é: "+ getResultado());
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public double getValor1() {
        return valor1;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    public double getValor2() {
        return valor2;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getResultado() {
        return resultado;
    }
    
}
