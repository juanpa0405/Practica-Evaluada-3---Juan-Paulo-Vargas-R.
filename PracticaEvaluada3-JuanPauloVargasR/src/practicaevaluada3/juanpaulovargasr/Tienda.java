/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3.juanpaulovargasr;

import javax.swing.JOptionPane;

/**
 *
 * @author juamp
 */
public class Tienda {

    private String[] productos;
    private int[][] ventas;
    private String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public Tienda(int cantidadProductos) {
        productos = new String[cantidadProductos];
        ventas = new int[7][cantidadProductos];
    }

    public void ingresarProductos() {
        for (int i = 0; i < productos.length; i++) {
            productos[i] = JOptionPane.showInputDialog("Digite el nombre del producto " + (i + 1) + ":");
        }
    }

    public void generarVentas() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < productos.length; j++) {
                ventas[i][j] = (int)Math.random() * 10; 
            }
        }
    }

    public void calcularTotalesPorProducto() {
        String resultado = "Total de ventas por producto:";
        for (int j = 0; j < productos.length; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][j];
            }
            resultado += productos[j] + ": " + total + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void diaConMasVentas(){
        int diaMax = 0;
        int totalMax = 0;

        for (int i = 0; i < 7; i++) {
            int sumaDia = 0;
            for (int j = 0; j < productos.length; j++) {
                sumaDia += ventas[i][j];
            }
            if (sumaDia > totalMax) {
                totalMax = sumaDia;
                diaMax = i;
            }
        }
        JOptionPane.showMessageDialog(null, "El día con más ventas es "+ dias[diaMax] + " con un total de " + totalMax);
    }


    public void productoMasVendido() {
        int productoMax = 0;
        int totalMax = 0;

        for (int j = 0; j < productos.length; j++) {
            int total = 0;
            for (int i = 0; i < 7; i++) {
                total += ventas[i][j];
            }
            if (total > totalMax) {
                totalMax = total;
                productoMax = j;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto más vendido fue " + productos[productoMax] + " con " + totalMax + " ventas.");
    }


    public void mostrarMatriz() {
        String salida = "Ventas semanales:\n";
        for (int i = 1; i < 7; i++) {
            salida += dias[i] + ": ";
            for (int j = 0; j < productos.length; j++) {
                salida += ventas[i][j] + " ";
            }
            salida += "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
         
}

