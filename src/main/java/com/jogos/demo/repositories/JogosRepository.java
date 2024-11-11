package com.jogos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jogos.demo.entities.Jogos;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long> {

}
