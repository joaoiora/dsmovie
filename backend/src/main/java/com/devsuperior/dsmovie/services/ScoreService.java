package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {

  @Autowired
  private MovieRepository movieRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ScoreRepository scoreRepository;

  @Transactional
  public MovieDTO saveScore(ScoreDTO dto) {
    var user = userRepository.findByEmail(dto.getEmail());
    if (user == null) {
      user = new User(dto.getEmail());
      // saveAndFlush: garantia de objeto atualizado
      user = userRepository.saveAndFlush(user);
    }
    var movie = movieRepository.findById(dto.getMovieId()).get();
    var score = new Score();
    score.setMovie(movie);
    score.setUser(user);
    score.setValue(dto.getScore());
    score = scoreRepository.saveAndFlush(score);
    final var totalScores = movie.getScores().size();
    final var scores = movie.getScores().stream().mapToDouble(Score::getValue).sum();
    movie.setScore(scores / totalScores);
    movie.setCount(totalScores);
    movie = movieRepository.save(movie);
    return new MovieDTO(movie);
  }

}
