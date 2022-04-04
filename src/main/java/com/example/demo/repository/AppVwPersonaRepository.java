package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AppVwPersona;


@Repository
public interface AppVwPersonaRepository extends JpaRepository<AppVwPersona, String> {
	
	@Query("select u from AppVwPersona u where u.id_pais = ?1 and u.id_persona = ?2")
	AppVwPersona findByIdPaisAndIdPersona(String idPais, String idPersona);

}
