package com.talentotech.Clase03;

// (Necesario importar esta libreria para usar el ingreso por teclado.)
// import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
    	Producto producto1 = new Ropa("Remera", 1000.0, 10, "M");

        producto1.mostrarDatos();
        System.out.println("Categoria: " + producto1.getCategoria());

        Producto producto2 = new Ropa("Pantalon", 2000.0, 5, "L");
        producto2.mostrarDatos();
        System.out.println("Categoria: " + producto2.getCategoria());

        System.out.println("--------------------------------");
        System.out.println("Total de productos: " + Producto.getTotalProductos());
        
    }
}
/*
 * TESTING:
 * TEST 01:
 * ID: 1
           Nombre: Remera
           Precio: 1000.0
           Stock: 1
           Categoria: Ropa
           ID: 2
           Nombre: Pantalon
           Precio: 2000.0
           Stock: 1
           Categoria: Ropa
           --------------------------------
           Total de productos: 2
 * 
 */
