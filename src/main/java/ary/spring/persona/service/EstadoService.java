package ary.spring.persona.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ary.spring.persona.model.Estado;
import ary.spring.persona.repository.EstadoRepository;

@Service
public class EstadoService implements EstadoRepository {
	
	@Autowired   //inyectamos
	private EstadoRepository estadoRepository;

	@Override
	public List<Estado> findAll() {
		
		return estadoRepository.findAll();
	}
	
	//creamos un metodo personalizado y la pasamos el parametro id
	public List<Estado> getAllByCountry(Long id) {
		
		List<Estado> estadosRespuesta = new ArrayList<>();
		
		//aqui se pasa la lista del estados de todos los paises del mundo
		List<Estado>  estados = estadoRepository.findAll();
		
		//creamos un for para recoger toda la lista
	    for (int i = 0; i < estados.size(); i++) {
			
	    	//aqui cogemos todos los estados que tiene el mismo id del pais 
	    	if (estados.get(i).getPais().getId() == id) {
	    		
	    		//las guardamos en estado respuesta 
	    		estadosRespuesta.add(estados.get(i));
			}
		}
	    
	    //retornamos la lista guardada
	    return estadosRespuesta;
	}

	
	@Override
	public List<Estado> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estado> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Estado> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Estado> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Estado getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Estado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Estado> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Estado entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Estado> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Estado> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Estado> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Estado> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
