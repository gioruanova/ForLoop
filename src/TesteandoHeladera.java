import javax.swing.*;

public class TesteandoHeladera {

    public static void main(String[] args) {

        String ingresoProductos;
        double precioProducto;
        String unirProductos = "";
        double totalCompra = 0;

        while (true) {
            ingresoProductos = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a registrar: \n(puede ingresar 'Listo' para finalizar la lista)");


            if (ingresoProductos.equalsIgnoreCase("listo")) {
                break;
            }
            precioProducto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto"));
            totalCompra = totalCompra + precioProducto;

            unirProductos = unirProductos + ingresoProductos + " - $" + precioProducto + ";";
        }

        String[] productostotales = unirProductos.split(";");

        System.out.println("-----------------");
        System.out.println("El listado de sus productos es:");
        for (String listado : productostotales) {
            System.out.println(listado);
        }
        System.out.println("______________________________");
        System.out.println("El total de la compra es: $" + totalCompra + "-");
        System.out.println("______________________________");

    }
}
