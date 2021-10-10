package ary.spring.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ary.spring.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
