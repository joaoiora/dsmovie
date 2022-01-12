package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;

/**
 * @author João Iora
 */
public interface ScoreRepository
  extends JpaRepository<Score, Long> {

}
