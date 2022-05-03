package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.repository.entity.Usuario;

//@Repository
public interface UsuarioRepoJPA extends JpaRepository<Usuario, String> {

}
