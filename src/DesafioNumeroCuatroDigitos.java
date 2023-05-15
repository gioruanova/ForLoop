import javax.swing.*;

public class DesafioNumeroCuatroDigitos {
    public static void main(String[] args) {

        String uni = "";
        String dec = "";
        String cen = "";
        String mil = "";
        String nro_ingresado = JOptionPane.showInputDialog(null, "ingresar numero de 4 digitos");

        if (nro_ingresado.length() == 4) {
            mil = String.valueOf(nro_ingresado.charAt(0));
            cen = String.valueOf(nro_ingresado.charAt(1));
            dec = String.valueOf(nro_ingresado.charAt(2));
            uni = String.valueOf(nro_ingresado.charAt(3));

            if (mil.equals(uni) && dec.equals(cen)) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }

        } else if (nro_ingresado.length() < 4) {
            System.out.println("El numero debe ser de 4 digitos");
        }
    }
}

