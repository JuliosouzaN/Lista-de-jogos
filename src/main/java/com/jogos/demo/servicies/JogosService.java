package com.jogos.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jogos.demo.dto.JogosDto;
import com.jogos.demo.dto.JogosDtoDois;
import com.jogos.demo.entities.Jogos;
import com.jogos.demo.projections.JogosProjection;
import com.jogos.demo.repositories.JogosRepository;

@Service
public class JogosService {
	
	@Autowired
	private JogosRepository jogosRepository;
	
	@Transactional(readOnly = true)
	public JogosDtoDois findById(Long id) {
		var resultado = jogosRepository.findById(id).get();
		return new JogosDtoDois(resultado);
	}
	
	@Transactional(readOnly = true)
	public List<JogosDto> findall(){
		List <Jogos>resultado = jogosRepository.findAll();
		return resultado.stream().map(x -> new JogosDto(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<JogosDto> findByLista(Long listaId){
		List<JogosProjection> resultado = jogosRepository.searchByList(listaId);
		return resultado.stream().map(x -> new JogosDto(x)).toList();
	}
}
