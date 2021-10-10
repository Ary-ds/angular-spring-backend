package ary.spring.persona.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ary.spring.persona.model.Pais;
import ary.spring.persona.service.PaisService;

@RestController
@RequestMapping("/pais")  //url base
public class PaisRestController {
	
	@Autowired
	private PaisService paisService;
	
	
	@GetMapping   //el metodo retorna una lista con todos los paises
	private ResponseEntity<List<Pais>> getAllPais (){
		return ResponseEntity.ok(paisService.findAll());
	}
}
