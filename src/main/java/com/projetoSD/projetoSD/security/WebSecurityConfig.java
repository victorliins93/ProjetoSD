package com.projetoSD.projetoSD.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.projetoSD.projetoSD.service.ImplementsUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private ImplementsUserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
			.anyRequest().authenticated()
			.and().formLogin().permitAll()
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// cria uma conta default
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}
}
