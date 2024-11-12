package com.jogos.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogos.demo.dto.JogosDto;
import com.jogos.demo.dto.ListaJogosDto;
import com.jogos.demo.servicies.JogosService;
import com.jogos.demo.servicies.ListaJogosService;

@RestController
@RequestMapping("/listas")
public class ListaJogosController {
	
	@Autowired
	public ListaJogosService listaJogosService;
	
	@Autowired
	public JogosService jogosService;
	
	@GetMapping
	public List<ListaJogosDto> findAll(){
		List<ListaJogosDto> resultado = listaJogosService.findall();
		return resultado;
	}
	
	@GetMapping(value = "/{listaId}/jogos")
	public List<JogosDto> findByLista(@PathVariable Long listaId){
		List<JogosDto> resultado = jogosService.findByLista(listaId);
		return resultado;
	}
}
