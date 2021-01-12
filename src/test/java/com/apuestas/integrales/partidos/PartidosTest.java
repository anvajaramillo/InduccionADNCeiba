package com.apuestas.integrales.partidos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import entity.PartidoEntity;

@SpringBootTest
public class PartidosTest {
	
//	@Autowired
//    private TestRestTemplate template;
//	
//	 private static String PARTIDOS_ENDPOINT = "http://localhost:8080/api/partidos";
//	 
//	 @Test
//	 void crearPartidos() throws ParseException {
//		 
//		ResponseEntity<PartidoEntity> response = template.getForEntity(PARTIDOS_ENDPOINT, PartidoEntity.class);
//		PartidoEntity partido = response.getBody();
//		 
//		String fechaYHora = "2021-01-12 17:00:00";
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//		Date horaInicio = format.parse(fechaYHora);  
//		PartidoEntity partido = new PartidoEntity("Colombia","Venezuela",horaInicio);
//		
//		template.postForEntity(PARTIDOS_ENDPOINT, partido, PartidoEntity.class);
//		
//		HttpHeaders requestHeaders = new HttpHeaders();
//	    requestHeaders.add("Content-type", "text/uri-list");
//	    HttpEntity<String> httpEntity = new HttpEntity<>(PARTIDOS_ENDPOINT, requestHeaders);
//	    template.exchange(PARTIDOS_ENDPOINT, HttpMethod.GET, httpEntity, String.class);
//		
//		
//	 }

}
