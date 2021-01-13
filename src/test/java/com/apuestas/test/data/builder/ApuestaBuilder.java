package com.apuestas.test.data.builder;

import entity.ApuestaEntity;
import entity.PartidoEntity;

public class ApuestaBuilder {
	
	private Long id;
	private int dinero;
	private String nombre;
	private String cedula;
	private int puntajePais1;
	private int puntajePais2;
	private boolean isGanador;
    private int dineroGanado;
    private PartidoEntity partido;
    
    public ApuestaBuilder() {
    	dinero = 100000;
    	nombre = "Angie Vanessa Jaramillo";
    	cedula = "1088310797";
    	puntajePais1 = 1;
    	puntajePais2 = 2;
    }
    
    public ApuestaBuilder withId(Long id) {
    	this.id = id;
    	return this;
    }
    
    public ApuestaBuilder withDinero(int dinero) {
    	this.dinero = dinero;
    	return this;
    }
    
    public ApuestaBuilder withNombre(String nombre) {
    	this.nombre = nombre;
    	return this;
    }
    
    public ApuestaBuilder withCedula(String cedula) {
    	this.cedula = cedula;
    	return this;
    }
    
    public ApuestaBuilder withPuntajePais1(int puntajePais1) {
    	this.puntajePais1 = puntajePais1;
    	return this;
    }
    
    public ApuestaBuilder withPuntajePais2(int puntajePais2) {
    	this.puntajePais2 = puntajePais2;
    	return this;
    }
    
    public ApuestaBuilder withIsGanador(boolean isGanador) {
    	this.isGanador = isGanador;
    	return this;
    }
    
    public ApuestaBuilder withDineroGanado(int dineroGanado) {
    	this.dineroGanado = dineroGanado;
    	return this;
    }
    
    public ApuestaBuilder withPartidoEntity(PartidoEntity partido) {
    	this.partido = partido;
    	return this;
    }
    
    public ApuestaEntity buid() {
    	return new ApuestaEntity(id,dinero,nombre,cedula,puntajePais1,puntajePais2,isGanador,dineroGanado,partido);
    }
    
    public static ApuestaBuilder anApuesta() {
    	return new ApuestaBuilder();
    }

}
