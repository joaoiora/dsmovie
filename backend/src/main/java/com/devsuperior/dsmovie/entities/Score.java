package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author João Iora
 */
@Entity
@Table(name = "tb_score")
public class Score {

  /**
   *
   */
  @EmbeddedId
  private ScorePrimaryKey id = new ScorePrimaryKey();

  /**
   *
   */
  private Double value;

  /**
   *
   */
  public Score() {
    super();
  }

  /**
   * @param id
   * @param value
   */
  public Score(ScorePrimaryKey id, Double value) {
    super();
    this.id = id;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Score [id=" +
           id +
           ", value=" +
           value +
           "]";
  }

  /**
   * @param movie
   */
  public void setMovie(Movie movie) {
    id.setMovie(movie);
  }

  /**
   * @param user
   */
  public void setUser(User user) {
    id.setUser(user);
  }

  /**
   * @return the id
   */
  public ScorePrimaryKey getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(ScorePrimaryKey id) {
    this.id = id;
  }

  /**
   * @return the value
   */
  public Double getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(Double value) {
    this.value = value;
  }

}
