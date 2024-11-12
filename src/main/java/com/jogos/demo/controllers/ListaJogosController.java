package com.jogos.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogos.demo.dto.ListaJogosDto;
import com.jogos.demo.servicies.ListaJogosService;

@RestController
@RequestMapping("/listas")
public class ListaJogosController {
	
	@Autowired
	public ListaJogosService listaJogosService;
	
	@GetMapping
	public List<ListaJogosDto> findAll(){
		List<ListaJogosDto> resultado = listaJogosService.findall();
		return resultado;
	}
}
