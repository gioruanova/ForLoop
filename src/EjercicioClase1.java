import javax.swing.*;

public class EjercicioClase1 {

    public static void main(String[] args) {
        //CUENTA REGRESIVA DEL 20 AL 0 DE A 2

//        FORMA 1
//        int nroInicial = 20;
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(nroInicial);
//            nroInicial = nroInicial - 2;
//        }


        //FORMA 2
//        for (int i = 20; i >= 0; i--) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        FORMA 3
//            for (int i = 20; i >= 0; i -= 2)
//                System.out.println(i);
//            }

//        FORMA 3B
//        for (int i = 20; i >= 0; i -= 2) System.out.println(i);
//        System.out.println("chau");

//        for (int i = 20; i >= 0;  System.out.println(i),i -= 2, System.out.println("chau")) ;

//        FORMA 4
//            int numero = 20;
//            do {
//                System.out.println(numero);
//                numero = numero - 2;
//            } while (numero >= 0);




        //pedir un nro entre 0 y 999 y decir si es capicua, pero de 4 nros
        String uni = "";
        String dec = "";
        String cen = "";
        String nro_ingresado = JOptionPane.showInputDialog(null, "ingresar nro");


        if (nro_ingresado.length() == 3) {
            cen = String.valueOf(nro_ingresado.charAt(0));
            dec = String.valueOf(nro_ingresado.charAt(1));
            uni = String.valueOf(nro_ingresado.charAt(2));

                    if (uni.equals(cen)) {
                        System.out.println("numero es capicua");
                    } else {
                        System.out.println("numero no es capicua");
                    }

        } else if (nro_ingresado.length() == 2) {
            dec = String.valueOf(nro_ingresado.charAt(1));
            uni = String.valueOf(nro_ingresado.charAt(0));
                    if (uni.equals(dec)) {
                        System.out.println("numero es capicua");
                    } else {
                        System.out.println("numero no es capicua");
                    }
        } else {
            System.out.println("nro no capicua");
        }

    }
}




