package com.learning;

public class ej3 {
    public static void main(String[] args) {
        String[] nombres ={"juan", "pepe", "fulano", "mengano"};

        String texto ="la lista de nombres es: ";

       for(String nombre : nombres){
           texto += nombre + " ";

       }

       System.out.println(texto);







    }
}
