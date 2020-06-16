package com.projetoSD.projetoSD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.projetoSD.projetoSD.model.entity.Usuario;
import com.projetoSD.projetoSD.model.repository.UsuarioRepository;


@Repository
public class ImplementsUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario user = repository.findByLogin(login);
		
		if(user == null) {
			throw new UsernameNotFoundException("Usuario não encontrado.");
		}
		return user;
	}

}
