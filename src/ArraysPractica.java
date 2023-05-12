import javax.swing.*;

public class ArraysPractica {

    //    psvm para crear clase rapida
    public static void main(String[] args) {
//        String[] frutas = {"manzana", "banana", "pera", "naranja"};
//
//        for (String element : frutas) {
//            System.out.println("fruta: " + element);
//        }
//        System.out.println("-----------------");
//        System.out.println("la primer fruta es " + frutas[0] + "\nla segunda fruta es " + frutas[1] + "\nla tercer fruta es " + frutas[2] + "\nla cuarta fruta es " + frutas[3]);
//        System.out.println("-----------------");
//        ---------------------------------------------------------------

        int cantidadDeProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos a registrar"));
        String[] productosRegistrados = new String[cantidadDeProductos];

        for (int i = 0; i < productosRegistrados.length; i++) {
            productosRegistrados[i] = JOptionPane.showInputDialog(null, "Ingrese el producto a registrar " + (i+1) );
        }

        System.out.println("--------\nSus productos son:");
        for (String productosRegistrado : productosRegistrados) {
            System.out.println(productosRegistrado);

        }
    }
}
