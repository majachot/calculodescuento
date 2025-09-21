/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodescuento;

/**
 *
 * @author Soluciones
 */
public class Calculodescuento {

    // Método que calcula el descuento dado un monto total y un porcentaje específico
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    // Método sobrecargado que aplica un 10% de descuento por defecto
    public static double calcularDescuento(double montoTotal) {
        double porcentajeDescuentoPorDefecto = 10.0;
        return calcularDescuento(montoTotal,porcentajeDescuentoPorDefecto ); // Usa el método anterior con 10% de descuento
    }

    public static void main(String[] args) {
        // Caso 1: Usando solo el monto total (descuento por defecto del 10%)
        double monto1 = 1000.90;
        double descuento1 = calcularDescuento(monto1);
        double totalPagar1 = monto1 - descuento1;

        System.out.println("Caso 1: Descuento del 10% por defecto");
        System.out.println("Monto original: " + monto1 + "$");
        System.out.println("Descuento aplicado: " + descuento1 + "$");
        System.out.println("Monto final a pagar: " + totalPagar1 + "$");
        System.out.println();

        // Caso 2: Usando un descuento específico (por ejemplo, 15%)
        double monto2 = 2000.40;
        double porcentajeDescuento2 = 15.0;
        double descuento2 = calcularDescuento(monto2, porcentajeDescuento2);
        double totalPagar2 = monto2 - descuento2;

        System.out.println("=== Caso 2: Descuento del 15% ===");
        System.out.println("Monto original: " + monto2 + "$");
        System.out.println("Descuento explícito " + porcentajeDescuento2 + "%");
        System.out.println("Descuento aplicado: " + descuento2 + "$");
        System.out.println("Monto final a pagar: " + totalPagar2 + "$");
    }

}


