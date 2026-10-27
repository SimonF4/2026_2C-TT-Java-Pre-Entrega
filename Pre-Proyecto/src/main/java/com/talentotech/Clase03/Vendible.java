package com.talentotech.Clase03;

// CLASE 05: Se creo y completo las interfaces Vendible y Etiquetable.
// INTERFAZ:
public interface Vendible {

	// --- ATRIBUTOS: ---
	// Las interfaces solo pueden tener constantes.
	String ESTADO_DEFAULT = "Disponible";
	
	// --- CONSTRUCTOR: ---
	// Clases abstractas no tienen constructor. Pq no se pueden crear objetos de esta clase.
	
	// --- METODOS: ---
	// Ejemplo metodo abstracto (aka vacio).
	// Por defecto los metodos en interfaces son siempre "public abstract" => no es necesario aclarar.
	void aplicarDescuento (double porcentaje);
	
	// Ejemplo metodo default:
	default void mostrarEstado () {
		System.out.println(("Estado del producto: "+ ESTADO_DEFAULT));
	}
	
	// Ejemplo metodo static (de clase, no de instancia):
	static double calcularDescuento (Double precio, Double porcentaje) {
		return precio - (precio * porcentaje / 100 );
	}
}
