package com.apuestas.unitarias.partidos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import entity.PartidoEntity;
import repository.IPartidoRepository;

@SpringBootTest
class PartidosTest {
	
//	@Autowired
//	private IPartidoRepository partidoRepository;
//	PartidoEntity partidoGuardado;
//	
//	@BeforeEach
//	void crearPartido() throws ParseException {
//		
//		String fechaYHora = "2021-01-12 17:00:00";
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//		Date horaInicio = format.parse(fechaYHora);  
//		PartidoEntity partido = new PartidoEntity("Colombia","Venezuela",horaInicio);
//		partidoGuardado = partidoRepository.save(partido);
//		
//	}
//	
//	@Test
//	void guardarPartido() throws ParseException {
//		assertNotNull(partidoGuardado.getId());
//	}
//	
//	@Test 
//	void consultarPartido(){
//		
//		List<PartidoEntity> partidosGuardados = new ArrayList<>();
//		partidosGuardados.add(partidoGuardado);
//		
//		List<PartidoEntity> partidosConsultados =  (List<PartidoEntity>) partidoRepository.findAll();
//		
//		assertEquals(partidosGuardados.get(0).getId(),partidosConsultados.get(0).getId());
//		 
//	}
	
//	@Test
//	void modificarPartido() throws ParseException {
//		
//		PartidoEntity partidoModificado = partidoGuardado;
//		
//		String fechaYHora = "2021-01-12 20:00:00";
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//		Date horaFin = format.parse(fechaYHora);  
//		
//		partidoModificado.setHoraFin(horaFin);
//		partidoModificado.setPuntajePais1(1);
//		partidoModificado.setPuntajePais2(2);
//		
//	}
	
//	@AfterEach
//	void limpiarPartido() {
//		partidoGuardado = null;
//	}


}
