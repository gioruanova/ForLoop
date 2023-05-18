import javax.swing.*;

public class DesafioNumeroCuatroDigitos {
    public static void main(String[] args) {

        String uni;
        String dec;
        String cen;
        String mil;
        String nro_ingresado;
        int nroValidador;

        nro_ingresado = JOptionPane.showInputDialog(null, "Ingrese un número de 4 dígitos:");
        nroValidador = Integer.parseInt(nro_ingresado);

        while (nroValidador <= 999 || nroValidador > 9999) {
            nroValidador = Integer.parseInt(nro_ingresado);
            nro_ingresado = JOptionPane.showInputDialog(null, "2 - Ingrese un número de 4 dígitos:");
            nroValidador = Integer.parseInt(nro_ingresado);
        }


        mil = String.valueOf(nro_ingresado.charAt(0));
        cen = String.valueOf(nro_ingresado.charAt(1));
        dec = String.valueOf(nro_ingresado.charAt(2));
        uni = String.valueOf(nro_ingresado.charAt(3));

        if (mil.equals(uni) && dec.equals(cen)) {
            System.out.println("El numero es capicua");
            JOptionPane.showMessageDialog(null, "El numero es CAPICUA");
        } else {
            JOptionPane.showMessageDialog(null, "El numero NO es CAPICUA");
        }
    }
}


