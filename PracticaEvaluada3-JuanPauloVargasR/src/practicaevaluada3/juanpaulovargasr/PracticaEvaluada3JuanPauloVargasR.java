/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3.juanpaulovargasr;

/**
 *
 * @author juamp
 */
public class PracticaEvaluada3JuanPauloVargasR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite la cantidad de productos:"));
        Tienda tienda = new Tienda(cantidad);

        tienda.ingresarProductos();
        tienda.generarVentas();
        tienda.mostrarMatriz();
        tienda.calcularTotalesPorProducto();
        tienda.diaConMasVentas();
        tienda.productoMasVendido();
    }
}
    
