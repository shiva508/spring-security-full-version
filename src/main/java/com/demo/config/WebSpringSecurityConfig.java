package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSpringSecurityConfig extends WebSecurityConfigurerAdapter {
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication()
	.withUser("shiva").password("{noop}shiva").roles("USER");
}
	
	@Override
		protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/loginpage")
		.loginProcessingUrl("/login")
		.permitAll()
		.and()
		.logout().logoutUrl("/logout");
		}
	
}
