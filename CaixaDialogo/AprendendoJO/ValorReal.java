package AprendendoJO;
import javax.swing.JOptionPane;

public class ValorReal {
    public static void main(String[] args) {
        float x = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um valor: "));
        JOptionPane.showMessageDialog(null, "O valor de x é: "+ x);
    }
}
