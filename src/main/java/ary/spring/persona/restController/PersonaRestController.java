package ary.spring.persona.restController;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ary.spring.persona.model.Persona;
import ary.spring.persona.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping   //para enseñar la lista de todas las personas 
	private ResponseEntity<List<Persona>> getAllPersonas (){
		return ResponseEntity.ok(personaService.findAll());
	}
	
	@PostMapping    //para guadar las personas   obrigatoriamente tiene en enviar una persona 
	private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
		
		try {
			//creamos una persona
			Persona personaGuardada = personaService.save(persona);	
			//la pasamos la persona para guardar
		return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
		
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
//	@DeleteMapping (value = "delete/{id}")
//	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
//		personaService.deleteById(id);
//		return ResponseEntity.ok(!(personaService.findById(id)!=null));
//		
//	}

}
