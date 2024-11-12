package com.jogos.demo.dto;

import com.jogos.demo.entities.ListaDeJogos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ListaJogosDto {
	
	private Long id;
	private String nome;
	
	public ListaJogosDto(ListaDeJogos entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}
}
