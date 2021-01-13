package com.apuestas.pruebas.integracion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import entity.PartidoEntity;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.*;
import static com.apuestas.test.data.builder.PartidoBuider.anPartidoBuider;

import java.text.ParseException;

public class PartidosIntegracionTest {
	
	private final String CONTEXT_PATH="/api/partidos";
	
	@BeforeEach
	void setUp() throws Exception {
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
	}
	
	@Test
	final void crearPartido() throws ParseException {
		
		PartidoEntity partido = anPartidoBuider().build();
		Response response = given().
				contentType("application/json").
				accept("application/json").
				body(partido).
				when().
				post(CONTEXT_PATH).
				then().
				statusCode(201).
				contentType("application/json").
				extract().
				response();
		
		String partidoId = response.jsonPath().getString("id");
		assertNotNull(partidoId);
		
	}

}
