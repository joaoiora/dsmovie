package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author João Iora
 */
@Entity
@Table(name = "tb_user")
public class User {

  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   *
   */
  private String email;

  /**
   *
   */
  public User() {
    super();
  }

  /**
   * @param email
   */
  public User(String email) {
    this();
    this.email = email;
  }

  /**
   * @param id
   * @param email
   */
  public User(Long id, String email) {
    this(email);
    this.id = id;
  }

  @Override
  public String toString() {
    return "User [id=" +
           id +
           ", email=" +
           email +
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

}
