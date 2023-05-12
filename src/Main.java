import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Solciitar al usuario 6 numeros
        // evaluar esos 6 numeros y buscar entre ellos el minimo y maximo

        int valorMinimo = Integer.MIN_VALUE;
        int valorMaximo = Integer.MAX_VALUE;
        int inputNumero = 0;

        for (int i = 1; i <= 6; i++) {
            inputNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero " + i));

            if (i == 1) {
                valorMinimo = inputNumero;
                valorMaximo = inputNumero;

            } else if (inputNumero > valorMinimo && inputNumero > valorMaximo ) {
                valorMaximo = inputNumero;

            } else if (inputNumero < valorMinimo){
                valorMinimo = inputNumero;
            }
        }
        JOptionPane.showMessageDialog(null,"Valor Minimo es: " + valorMinimo +"\n y el valor Maximo es: " + valorMaximo);
    }
}