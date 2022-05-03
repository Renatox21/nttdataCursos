package com.everis.service;

import java.util.List;

import com.everis.repository.entity.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	Usuario buscarPorUsername(String username);
	
}
