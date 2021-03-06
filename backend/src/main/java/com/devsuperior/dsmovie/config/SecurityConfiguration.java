package com.devsuperior.dsmovie.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * @author João Iora
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration
  extends WebSecurityConfigurerAdapter {

  /**
   *
   */
  @Autowired
  private Environment env;

  /**
   *
   */
  @Override
  protected void configure(HttpSecurity http)
    throws Exception {
    final var profiles = List.of(env.getActiveProfiles());
    if (profiles.contains("test")) {
      http.headers().frameOptions().disable();
    }
    http.cors().and().csrf().disable();
    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    http.authorizeRequests().anyRequest().permitAll();
  }

  /**
   * @return
   */
  @Bean
  CorsConfigurationSource corsConfigurationSource() {
    final var configuration = new CorsConfiguration().applyPermitDefaultValues();
    configuration.setAllowedMethods(Arrays.asList("POST",
                                                  "GET",
                                                  "PUT",
                                                  "DELETE",
                                                  "OPTIONS"));
    final var source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**",
                                     configuration);
    return source;
  }

}
