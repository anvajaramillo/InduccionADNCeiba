package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dto.PartidoDTO;
import entity.PartidoEntity;
import service.IPartidoService;

@RestController
@RequestMapping("/api")
public class PartidoRestController {
	
	@Autowired
	private IPartidoService partidoService;
	
	@GetMapping("/partidos")
	public List<PartidoEntity> index(){
		return partidoService.findAll();
	}
	
	@GetMapping("/partidos/{id}")
	public PartidoEntity show(@PathVariable Long id) {
		return partidoService.finById(id);
	}
	
	@PostMapping("/partidos")
	@ResponseStatus(HttpStatus.CREATED)
	public PartidoEntity create(@RequestBody PartidoDTO partidoDto) {
		return partidoService.save(partidoDto);
	}
	
	@PutMapping("/partidos")
	public PartidoEntity update(@RequestBody PartidoDTO partidoDto) {		
		return partidoService.save(partidoDto);
	}
	
	@DeleteMapping("/partidos/{id}")
	public Integer delete(@PathVariable Long id) {
		return partidoService.delete(id);
	}

}

