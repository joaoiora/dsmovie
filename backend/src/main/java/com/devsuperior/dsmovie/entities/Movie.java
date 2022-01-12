package com.devsuperior.dsmovie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author João Iora
 */
@Entity
@Table(name = "tb_movie")
public class Movie {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  @OneToMany(mappedBy = "id.movie")
  private Set<Score> scores = new HashSet<>();

  /**
   *
   */
  public Movie() {
    super();
  }

  /**
   * @param title
   * @param score
   * @param count
   * @param image
   */
  public Movie(String title, Double score, Integer count, String image) {
    this();
    this.title = title;
    this.score = score;
    this.count = count;
    this.image = image;
  }

  /**
   * @param id
   * @param title
   * @param score
   * @param count
   * @param image
   */
  public Movie(Long id, String title, Double score, Integer count, String image) {
    this(title, score, count, image);
    this.id = id;
  }

  @Override
  public String toString() {
    return "Movie [id=" +
           id +
           ", title=" +
           title +
           ", score=" +
           score +
           ", count=" +
           count +
           ", image=" +
           image +
           "]";
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

  /**
   * @return the scores
   */
  public Set<Score> getScores() {
    return scores;
  }

  /**
   * @return
   */
  public Double getScoresAverage() {
    return getScoresSum() / getAmountOfScores();
  }

  /**
   * @return
   */
  public Double getScoresSum() {
    return scores.stream().mapToDouble(Score::getValue).sum();
  }

  /**
   * @return
   */
  public int getAmountOfScores() {
    return scores.size();
  }

  /**
   * @param scores the scores to set
   */
  public void setScores(Set<Score> scores) {
    this.scores = scores;
  }

}
