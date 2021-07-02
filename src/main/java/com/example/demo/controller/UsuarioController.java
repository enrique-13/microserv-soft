package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
	
	@Autowired
	private Map<String, String> usuarios;
	
	public List<String> devuelveUsuarios() {
		return usuarios.values().stream().collect(Collectors.toList());
	}
	
	@GetMapping
	@RequestMapping("{id}")
	public String devuelveUsuario(@PathVariable String id) {
		String strResp = "No existe este usuario: " + id;
		
		if (id != null && (!id.isEmpty())) {
			
			if (usuarios.containsKey(id)) {
				strResp = usuarios.get(id);
			}
						
		}
		
		return strResp;
		
	}

}
