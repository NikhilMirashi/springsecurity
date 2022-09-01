package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// username and password harcoding to authenticate
		auth.inMemoryAuthentication()
		.withUser("tranbow")
		.password(passwordEncoder().encode("itsmenikhil"))
		.roles("USER")
		.and()
		.withUser("admin")
	    .password(passwordEncoder().encode("admin123"))
		.roles("ADMIN", "USER");
	}

	// this will help us to save the password in encripted format
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeHttpRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/products/**").hasAnyRole("ADMIN","USER")
		.and()
		.formLogin();
	}
	
	

}
