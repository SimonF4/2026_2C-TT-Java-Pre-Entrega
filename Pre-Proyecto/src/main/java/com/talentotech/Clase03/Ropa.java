package com.talentotech.Clase03;

// HERENCIA: Ropa es una subclase de Producto.
public class Ropa extends Producto{

	private String talle;

	public Ropa(String nombre, double precio, int stock, String talle) {
		// "super", pq primero hay q crear el constructor de la clase padre, pq la clase padre tiene otros atributos extra. 
		super(nombre, precio, stock);
		this.talle = talle;
	}

	@Override
	public String getCategoria() {
		return "Ropa";
	}
}
