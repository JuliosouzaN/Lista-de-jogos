package com.jogos.demo.dto;

import com.jogos.demo.entities.Jogos;
import com.jogos.demo.projections.JogosProjection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JogosDto {
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public JogosDto(Jogos entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.ano = entity.getAno();
		this.imgUrl = entity.getImgUrl();
		this.descricaoCurta = entity.getDescricaoCurta();
	}
	
	public JogosDto(JogosProjection projection) {
		this.id = projection.getId();
		this.titulo = projection.getTitulo();
		this.ano = projection.getAno();
		this.imgUrl = projection.getImgUrl();
		this.descricaoCurta = projection.getDescricaoCurta();
	}
}
