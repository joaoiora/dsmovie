package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

/**
 * @author João Iora
 */
@Service
public class MovieService {

  /**
   *
   */
  @Autowired
  private MovieRepository repository;

  /**
   * @return
   */
  @Transactional(readOnly = true)
  public Page<MovieDTO> findAll(Pageable pageable) {
    final var movies = repository.findAll(pageable);
    return movies.map(MovieDTO::new);
  }

  @Transactional(readOnly = true)
  public MovieDTO findById(Long id) {
    Movie movie = repository.findById(id).get();
    return new MovieDTO(movie);
  }

}
