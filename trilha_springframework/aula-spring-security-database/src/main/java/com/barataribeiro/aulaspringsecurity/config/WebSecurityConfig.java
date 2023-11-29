package com.barataribeiro.aulaspringsecurity.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private SecurityDatabaseService securityService;

  @Autowired
  public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(securityService).passwordEncoder(new BCryptPasswordEncoder());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests(requests -> requests
        .antMatchers("/").permitAll()
        .antMatchers("/login").permitAll()
        .antMatchers("/managers").hasAnyRole("MANAGERS")
        .antMatchers("/users").hasAnyRole("USERS", "MANAGERS")
        .anyRequest().authenticated()).httpBasic(withDefaults());
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  /*
   * @Override
   * protected void configure(AuthenticationManagerBuilder auth) throws Exception
   * {
   * auth.inMemoryAuthentication()
   * .withUser("user")
   * .password("{noop}user123")
   * .roles("USERS")
   * .and()
   * .withUser("admin")
   * .password("{noop}master123")
   * .roles("MANAGERS");
   * }
   */
}
