package com.jogos.demo.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class ChavePrimariaPertencer {
	
	@ManyToOne
	@JoinColumn(name = "Jogo_id" )
	private Jogos jogos;
	
	@ManyToOne
	@JoinColumn(name = "Lista_id" )
	private ListaDeJogos listaDeJogos;
}
