package com.jogos.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogos.demo.dto.JogosDto;
import com.jogos.demo.dto.JogosDtoDois;
import com.jogos.demo.servicies.JogosService;

@RestController
@RequestMapping("/jogos")
public class JogosController {
	
	@Autowired
	public JogosService jogosService;
	
	@GetMapping
	public List<JogosDto> findAll(){
		List<JogosDto> resultado = jogosService.findall();
		return resultado;
	}
	
	@GetMapping(value = "/{id}")
	public JogosDtoDois findById(@PathVariable Long id){
		JogosDtoDois resultado = jogosService.findById(id);
		return resultado;
	}
	
}
