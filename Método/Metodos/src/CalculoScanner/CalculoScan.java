package CalculoScanner;

public class CalculoScan{
    double resultado;
    double primeirovalor;
    double segundovalor;

    public void mostrarResultados(){
        
        resultado = getPrimeirovalor() + getSegundovalor();
        System.out.println("O resultado da soma é: "+ getResultado());
    }

    public void setPrimeirovalor(double primeirovalor) {
        this.primeirovalor = primeirovalor;
    }
    public double getPrimeirovalor() {
        return primeirovalor;
    }
    public void setSegundovalor(double segundovalor) {
        this.segundovalor = segundovalor;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getSegundovalor() {
        return segundovalor;
    }
    
}

