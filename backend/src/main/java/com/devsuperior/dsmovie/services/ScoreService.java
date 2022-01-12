package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Movie;
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
    final var user = checkIfNewUser(dto);
    var movie = movieRepository.findById(dto.getMovieId()).get();
    saveScore(dto,
              user,
              movie);
    movie = updateMovieScore(movie);
    return new MovieDTO(movie);
  }

  private User checkIfNewUser(ScoreDTO dto) {
    var user = userRepository.findByEmail(dto.getEmail());
    if (user == null) {
      user = new User(dto.getEmail());
      // saveAndFlush: garantia de objeto atualizado
      user = userRepository.saveAndFlush(user);
    }
    return user;
  }

  private void saveScore(ScoreDTO dto, User user, Movie movie) {
    var score = new Score();
    score.setMovie(movie);
    score.setUser(user);
    score.setValue(dto.getScore());
    score = scoreRepository.saveAndFlush(score);
  }

  private Movie updateMovieScore(Movie movie) {
    // final var totalScores = movie.getScores().size();
    // final var scores = movie.getScores().stream().mapToDouble(Score::getValue).sum();
    movie.setScore(movie.getScoresAverage());
    movie.setCount(movie.getAmountOfScores());
    movie = movieRepository.save(movie);
    return movie;
  }

}
