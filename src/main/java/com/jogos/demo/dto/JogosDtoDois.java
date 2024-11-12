package com.jogos.demo.dto;

import org.springframework.beans.BeanUtils;

import com.jogos.demo.entities.Jogos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JogosDtoDois {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double pontuacao; 
	private String imgUrl;
	private String descricaoCurta;
	private String descricaoLonga;
	
	public JogosDtoDois (Jogos entity) {
		BeanUtils.copyProperties(entity, this);
	}
}
