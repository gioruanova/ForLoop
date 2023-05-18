import javax.swing.*;

public class DesafioNumeroCuatroDigitos {
    public static void main(String[] args) {

        String nro_ingresado = JOptionPane.showInputDialog(null, "Ingrese un número de 4 dígitos:");
        int nroValidador = Integer.parseInt(nro_ingresado);

        while (nroValidador <= 999 || nroValidador > 9999) {

            nro_ingresado = JOptionPane.showInputDialog(null, "El numero debe ser entre 999 y 9999.\n" +
                    "Ingrese un número de 4 dígitos:");
            nroValidador = Integer.parseInt(nro_ingresado);
        }

        String mil = String.valueOf(nro_ingresado.charAt(0));
        String cen = String.valueOf(nro_ingresado.charAt(1));
        String dec = String.valueOf(nro_ingresado.charAt(2));
        String uni = String.valueOf(nro_ingresado.charAt(3));

        if (mil.equals(uni) && dec.equals(cen)) {
            JOptionPane.showMessageDialog(null, "El numero es CAPICUA");
        } else {
            JOptionPane.showMessageDialog(null, "El numero NO es CAPICUA");
        }
    }
}


