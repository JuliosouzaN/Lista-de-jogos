package com.jogos.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jogos.demo.entities.Jogos;
import com.jogos.demo.projections.JogosProjection;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT tb_jogo.id, tb_jogo.titulo, tb_jogo.ano AS `ano`, tb_jogo.img_url AS imgUrl,
		tb_jogo.descricao_curta AS descricaoCurta, tb_pertencer.posicao
		FROM tb_jogo
		INNER JOIN tb_pertencer ON tb_jogo.id = tb_pertencer.jogo_id
		WHERE tb_pertencer.lista_id = :listaId
		ORDER BY tb_pertencer.posicao
			""")
	List<JogosProjection> searchByList(Long listaId);
}
