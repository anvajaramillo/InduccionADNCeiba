package com.apuestas.test.data.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entity.PartidoEntity;

public class PartidoBuider {
	
	private Long id;
	private String pais1;
	private String pais2;
	private Date horaInicio;
	private Date horaFin;
	private int puntajePais1;
	private int puntajePais2;
	
	public PartidoBuider() throws ParseException {
		pais1 = "Colombia";
		pais2 = "Venezuela";
		String fechaYHora = "2021-01-12 17:00:00";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date horaInicio = format.parse(fechaYHora);  
		this.horaInicio = horaInicio;
	}
	
	public PartidoBuider withId(Long id) {
		this.id = id;
		return this;
	}
	
	public PartidoBuider withPais1(String pais1) {
		this.pais1 = pais1;
		return this;
	}
	
	public PartidoBuider withPais2(String pais2) {
		this.pais2 = pais2;
		return this;
	}
	
	public PartidoBuider withHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
		return this;
	}
	
	public PartidoBuider withHoraFin(Date horaFin) {
		this.horaFin = horaFin;
		return this;
	}
	
	public PartidoBuider withPuntajePais1(int puntajePais1) {
		this.puntajePais1 = puntajePais1;
		return this;
	}
	
	public PartidoBuider withPuntajePais2(int puntajePais2) {
		this.puntajePais2 = puntajePais2;
		return this;
	}
	
	public PartidoEntity build() {
		return new PartidoEntity(id,pais1,pais2,horaInicio,horaFin,puntajePais1,puntajePais2);
	}
	
	public static PartidoBuider anPartidoBuider() throws ParseException {
		return new PartidoBuider();
	}


}
