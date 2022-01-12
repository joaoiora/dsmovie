package com.devsuperior.dsmovie.dto;

/**
 * @author João Iora
 */
public class ScoreDTO {

  /**
   *
   */
  private Long movieId;

  /**
   *
   */
  private String email;

  /**
   *
   */
  private Double score;

  /**
   *
   */
  public ScoreDTO() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @param movieId
   * @param email
   * @param score
   */
  public ScoreDTO(Long movieId, String email, Double score) {
    super();
    this.movieId = movieId;
    this.email = email;
    this.score = score;
  }

  /**
   * @return the movieId
   */
  public Long getMovieId() {
    return movieId;
  }

  /**
   * @param movieId the movieId to set
   */
  public void setMovieId(Long movieId) {
    this.movieId = movieId;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the score
   */
  public Double getScore() {
    return score;
  }

  /**
   * @param score the score to set
   */
  public void setScore(Double score) {
    this.score = score;
  }

}
