package com.learning;

public class ej2 {
    public static void main(String[] args) {

        // calcular un precio con el iva
        double precio = 50;
        double iva = 20;
        double precioTotal =  precio + (precio * iva / 100);
        System.out.println("el precio a pagar es: "+ precioTotal);
