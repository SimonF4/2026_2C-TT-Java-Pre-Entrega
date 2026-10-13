package com.talentotech;

// INTERFAZ:
public interface Vendible {

	// ATRIBUTOS:
	// Las interfaces solo pueden tener constantes.
	String ESTADO_DEFAULT = "Disponible";
	
	// CONSTRUCTOR:
	// Clases abstractas no tienen constructor. Pq no se pueden crear objetos de esta clase.
	
	// Ejemplo metodo abstracto (aka vacio).
	void aplicarDescuento (double porcentaje);
	
	// Ejemplo metodo default:
	default void mostrarEstado () {
		System.out.println(("Estado del producto: "+ ESTADO_DEFAULT));
	}
	
	// Ejemplo metodo static:
	static double calcularDescuento (Double precio, Double porcentaje) {
		return precio - (precio * porcentaje / 100 );
	}
}
