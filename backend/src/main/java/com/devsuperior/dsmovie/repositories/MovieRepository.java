package com.devsuperior.dsmovie.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

/**
 * @author João Iora
 */
public interface MovieRepository
  extends JpaRepository<Movie, Long> {

  /**
   * @param pageable
   *
   * @return
   */
  Page<Movie> findAllByOrderByIdAsc(Pageable pageable);

}
