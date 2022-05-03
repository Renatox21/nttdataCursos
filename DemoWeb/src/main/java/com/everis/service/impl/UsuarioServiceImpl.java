package com.everis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.everis.repository.UsuarioRepoJPA;
import com.everis.repository.entity.Usuario;
import com.everis.service.UsuarioService;

//Servicio de Usuario valido para Sprint Security
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {

	@Autowired
	UsuarioRepoJPA usuarioDAO;
	
	@Override
	public List<Usuario> listar() {		
		return usuarioDAO.findAll();
	}

	@Override
	public Usuario buscarPorUsername(String username) {		
		return usuarioDAO.getById(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return (UserDetails) buscarPorUsername(username);
	}

	
	
}
