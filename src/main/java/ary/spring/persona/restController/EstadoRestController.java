package ary.spring.persona.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ary.spring.persona.model.Estado;
import ary.spring.persona.service.EstadoService;

@RestController
@RequestMapping("/estado/")  //url base
public class EstadoRestController {
	
	
	@Autowired       //inyectamos la clase service
	private EstadoService responseEntity;
	
	
//	@GetMapping    //metodo los url que provamos 
//	private ResponseEntity<List<Estado>> getAllEstado(){
//		return ResponseEntity.ok(responseEntity.findAll());
//	}
	
	
	@GetMapping("{id}")   //metodo los url que provamos      que recibe el paramentro idpais
	private ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") Long idPais){
		
		//aqui retornamos el metodo que tiene el estado con el mis id del pais
		return ResponseEntity.ok(responseEntity.getAllByCountry(idPais));
	}

}
