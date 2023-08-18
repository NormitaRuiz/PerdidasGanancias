package com.pe.cibertec.ventas;

public class Ventas {
	
	Double precioFabricacion=200d;
	Double ventas=50000d;
	double gastosOperacion=300d;
	
	public Ventas() {
		this.precioFabricacion=precioFabricacion;
		this.ventas=ventas;
		this.gastosOperacion=gastosOperacion;
	}
	
	public Double utilidadBruta() {
		
		return ventas ;
		
		
	}
	
	public Double utilidadNeta() {
		
		Double utilnet=ventas-(precioFabricacion+gastosOperacion);
		return utilnet;
	}
	
	

}
