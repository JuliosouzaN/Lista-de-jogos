package com.jogos.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogos.demo.dto.JogosDto;
import com.jogos.demo.entities.Jogos;
import com.jogos.demo.repositories.JogosRepository;

@Service
public class JogosService {
	
	@Autowired
	private JogosRepository jogosRepository;
	
	
	public List<JogosDto> findall(){
		List <Jogos>resultado = jogosRepository.findAll();
		return resultado.stream().map(x -> new JogosDto(x)).toList();
	}
}
