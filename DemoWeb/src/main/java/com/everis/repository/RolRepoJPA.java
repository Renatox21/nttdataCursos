package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.repository.entity.Rol;

//@Repository
public interface RolRepoJPA extends JpaRepository<Rol, Integer> {

}
