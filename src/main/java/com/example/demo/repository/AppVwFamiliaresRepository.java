package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AppVwFamiliares;


@Repository
public interface AppVwFamiliaresRepository extends JpaRepository<AppVwFamiliares, String> {
	
	@Query("select u from AppVwFamiliares u where u.id_pais = ?1 and u.id_empleado = ?2")
	List<AppVwFamiliares> findByIdPaisAndIdEmpleado(String idPais, String idEmpleado);

}