package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author João Iora
 */
@Embeddable
public class ScorePrimaryKey
  implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   *
   */
  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;

  /**
   *
   */
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  /**
   *
   */
  public ScorePrimaryKey() {
    super();
  }

  /**
   * @param movie
   * @param user
   */
  public ScorePrimaryKey(Movie movie, User user) {
    super();
    this.movie = movie;
    this.user = user;
  }

  /**
   * @return the movie
   */
  public Movie getMovie() {
    return movie;
  }

  /**
   * @param movie the movie to set
   */
  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  /**
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * @param user the user to set
   */
  public void setUser(User user) {
    this.user = user;
  }

}
