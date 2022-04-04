package com.example.demo.controller;

import com.example.demo.repository.AppVwPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppVwPersona;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1_1/personas")
public class AppVwPersonaController {

	@Autowired
	private AppVwPersonaRepository app_vw_personaRepository;


	@GetMapping("/byIdPaisAndIdPersona")
	//@ResponseBody
	public AppVwPersona getEmployeeById(@RequestParam(name = "id_pais", required = true) String idPais,
			@RequestParam(name = "id_persona", required = true) String idPersona) {
		return app_vw_personaRepository.findByIdPaisAndIdPersona(idPais, idPersona);
	}

}
