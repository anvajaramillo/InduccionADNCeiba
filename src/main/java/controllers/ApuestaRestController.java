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
import dto.ApuestaDTO;
import entity.ApuestaEntity;
import service.IApuestaService;

@RestController
@RequestMapping("/api")
public class ApuestaRestController {
	
	@Autowired
	private IApuestaService apuestaService;
	
	@GetMapping("/apuestas")
	public List<ApuestaEntity> index(){
		return apuestaService.findAll();
	}
	
	@GetMapping("/apuestas/partido/{id}")
	public List<ApuestaEntity> showPartido(@PathVariable Long id){
		return apuestaService.findByPartidoId(id);
	}
	
	@GetMapping("/apuestas/consultarResultados/{idPartido}")
	public List<ApuestaEntity> showResults(@PathVariable Long idPartido){
		return apuestaService.consultarResultados(idPartido);
	}
	
	@GetMapping("/apuestas/{id}")
	public ApuestaEntity show(@PathVariable Long id) {
		return apuestaService.finById(id);
	}
	
	@PostMapping("/apuestas")
	@ResponseStatus(HttpStatus.CREATED)
	public ApuestaEntity create(@RequestBody ApuestaDTO apuestaDto) {
		return apuestaService.save(apuestaDto);
	}
	
	@PutMapping("/apuestas")
	public ApuestaEntity update(@RequestBody ApuestaDTO apuestaDto) {		
		return apuestaService.save(apuestaDto);
	}
	
	@DeleteMapping("/apuestas/{id}")
	public void delete(@PathVariable Long id) {
		apuestaService.delete(id);
	}
	
	

}
