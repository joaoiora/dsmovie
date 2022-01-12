package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

/**
 * @author João Iora
 */
public interface MovieRepository
  extends JpaRepository<Movie, Long> {

}
