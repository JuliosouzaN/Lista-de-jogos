package com.jogos.demo.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_pertencer")
@NoArgsConstructor
@Setter
@Getter
public class Pertencer {
	
	@EmbeddedId
	private ChavePrimariaPertencer id = new ChavePrimariaPertencer();
	
	private Integer position;

	public Pertencer(Jogos jogos, ListaDeJogos listaDeJogos, Integer position) {
		id.setJogos(jogos);
		id.setListaDeJogos(listaDeJogos);
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertencer other = (Pertencer) obj;
		return Objects.equals(id, other.id);
	}
}
