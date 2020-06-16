package com.projetoSD.projetoSD.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetoSD.projetoSD.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	
	Usuario findByLogin(String login);

}
