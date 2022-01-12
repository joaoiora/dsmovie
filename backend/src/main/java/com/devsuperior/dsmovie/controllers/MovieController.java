package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

/**
 * @author João Iora
 */
@RestController
@RequestMapping(value = "/movies")
public class MovieController {

  /**
   *
   */
  @Autowired
  private MovieService service;

  /**
   * @param pageable
   *
   * @return
   */
  @GetMapping
  public Page<MovieDTO> findAll(Pageable pageable) {
    return service.findAll(pageable);
  }

  /**
   * @param id
   *
   * @return
   */
  @GetMapping(value = "/{id}")
  public MovieDTO findById(@PathVariable Long id) {
    return service.findById(id);
  }

}
