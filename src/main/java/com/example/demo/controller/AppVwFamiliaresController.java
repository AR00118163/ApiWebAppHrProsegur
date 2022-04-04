package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppVwFamiliares;
import com.example.demo.repository.AppVwFamiliaresRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1_1/familiares")
public class AppVwFamiliaresController {

	@Autowired
	AppVwFamiliaresRepository app_vw_familiaresRepository;
	
	@GetMapping("/byPaisAndIdEmpleado")
	//@ResponseBody
	public ResponseEntity<List<AppVwFamiliares>> getFamilyById(@RequestParam(name = "id_pais", required = true) String idPais,
			@RequestParam(name = "id_empleado", required = true) String idEmpleado) {
		try {
			List<AppVwFamiliares> familiares = new ArrayList<AppVwFamiliares>();

			app_vw_familiaresRepository.findByIdPaisAndIdEmpleado(idPais, idEmpleado).forEach(familiares::add);
			if (familiares.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(familiares, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
		
	}
	
}
