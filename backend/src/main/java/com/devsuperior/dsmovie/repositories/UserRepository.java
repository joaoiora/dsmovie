package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

/**
 * @author João Iora
 */
public interface UserRepository
  extends JpaRepository<User, Long> {

  User findByEmail(String email);

}
