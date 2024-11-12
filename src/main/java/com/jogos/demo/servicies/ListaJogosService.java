package com.jogos.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jogos.demo.dto.ListaJogosDto;
import com.jogos.demo.entities.ListaDeJogos;
import com.jogos.demo.repositories.ListaJogosRepository;

@Service
public class ListaJogosService {
	
	@Autowired
	private ListaJogosRepository listaJogosRepository;
	
	@Transactional(readOnly = true)
	public List<ListaJogosDto> findall(){
		List <ListaDeJogos>resultado = listaJogosRepository.findAll();
		return resultado.stream().map(x -> new ListaJogosDto(x)).toList();
	}
}
