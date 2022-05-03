package com.everis.repository;

import java.util.List;

import com.everis.repository.entity.Empleado;

public interface EmpleadoRepo {

	public void regitrar(String nombre);
	public List<Empleado> listarCuyoNombreContiene(String texto_nombre);	
}
