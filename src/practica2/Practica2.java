/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n_articulos;
        double subtotal = 0, total, descuento = 0, valor_p;

        System.out.print("Ingrese el numero de articulos que desea comprar: ");
        n_articulos = sc.nextInt();

        for (int i = 0; i < n_articulos; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ":");
            valor_p = sc.nextDouble();
            subtotal = subtotal + valor_p;
        }

        if (subtotal >= 300) {
            descuento = subtotal * 0.15;
        } else if (subtotal >= 200) {
            descuento = subtotal * 0.10;
        } else if (subtotal >= 100) {
            descuento = subtotal * 0.05;
        } else {
            descuento = 0;
        }

        total = subtotal - descuento;
        System.out.println("Sin descuento: " + subtotal);
        System.out.println("El descuento es de: " + descuento);
        System.out.print("El total a pagar es: " + total);
        
        sc.close();
    }
}
