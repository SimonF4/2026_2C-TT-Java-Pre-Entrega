package com.talentotech.Clase03;

public class Electronico extends Producto {
	// CLASE 05: clase Electronico completada para poder hacer testeos.
	
	private int mesesGarantia;

    public Electronico(String nombre, Double precio, int stock, int mesesGarantia) {
        super(nombre, precio, stock);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    @Override
    public String getCategoria() {
        return "electronico";
    }
}
