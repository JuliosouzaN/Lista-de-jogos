package com.jogos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jogos.demo.entities.ListaDeJogos;

@Repository
public interface ListaJogosRepository extends JpaRepository<ListaDeJogos, Long>{

}
