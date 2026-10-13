package com.talentotech.Clase03;

public abstract class Producto {

	// contador estatico:
	// Funciona a nivel de clase, no depende de una instancia creada.
	private static Long contadorId = 0L;
	private static int totalProductos = 0;
	
	// Atributos
	private Long id;
	private String nombre;
	private double precio; // No uso el wrapper en mi caso.
	private int stock;
	
	public Producto() {
		// Constructor default.
		// Le agregamos valores default/genericos/de inicio.
		this("Producto Generico", 0.0, 0);
	}
	
	public Producto (String nombre, double precio) {
		// Yo en mi caso aprovecho el otro constructor (con "this") para nada mas no repetir codigo.
		this(nombre, precio, 1);
	}

	public Producto(String nombre, double precio, int stock) {
		//this (nombre, precio, stock);
		this.id = ++contadorId;
		this.nombre = nombre;
		this.precio = precio;
		
		if (this.stock == 0) {
			this.stock = 1;
		}else {
			this.stock = stock;			
		}
		
		totalProductos++;
		// TODO Mejorar: Validaciones, extraerlas a metodos y validar los otros atributos.
	}

	// GETTERS Y SETTERS
	public Long getId() {
        return id;
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// Metodo ESTATICO:
	public static int getTotalProductos() {
		return totalProductos;
	}

	// OTROS METODOS:
	// metodos propios de la clase
	public void mostrarDatos() {
		System.out.println("ID: " 		+ id);
		System.out.println("Nombre: " 	+ nombre);
		System.out.println("Precio: " 	+ precio);
        System.out.println("Stock: " 	+ stock);
	}
	
	// CLASE 04:
	// Transformamos la clase Producto a una clase abstracta.
	
	// ---------- METODOS ABSTRACTOS ----------
	public abstract String getCategoria();
	
	// ---------- METODOS ESTATICOS ----------
	// getTotalProductos() - q ya hicimos al inicio de la clase.

}
