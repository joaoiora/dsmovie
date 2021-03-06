package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

/**
 * @author João Iora
 */
public class MovieDTO {

  private Long id;

  /**
   *
   */
  private String title;

  /**
   *
   */
  private Double score;

  /**
   *
   */
  private Integer count;

  /**
   *
   */
  private String image;

  /**
   *
   */
  public MovieDTO() {
    super();
  }

  /**
   * @param id
   * @param title
   * @param score
   * @param count
   * @param image
   */
  public MovieDTO(Long id, String title, Double score, Integer count, String image) {
    super();
    this.id = id;
    this.title = title;
    this.score = score;
    this.count = count;
    this.image = image;
  }

  /**
   * @param movie
   */
  public MovieDTO(Movie movie) {
    this(movie.getId(), movie.getTitle(), movie.getScore(), movie.getCount(), movie.getImage());
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
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

  /**
   * @return the count
   */
  public Integer getCount() {
    return count;
  }

  /**
   * @param count the count to set
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * @return the image
   */
  public String getImage() {
    return image;
  }

  /**
   * @param image the image to set
   */
  public void setImage(String image) {
    this.image = image;
  }

}
