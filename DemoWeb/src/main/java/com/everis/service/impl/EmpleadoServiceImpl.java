package com.everis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.repository.EmpleadoRepo;
import com.everis.repository.EmpleadoRepoJPA;
import com.everis.repository.entity.Empleado;
import com.everis.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	/*@Autowired
	EmpleadoRepo empleadoDAO;*/

	@Autowired
	EmpleadoRepoJPA empleadoDAO;
	
	@Override
	public void registrar(String name) {
		//empleadoDAO.regitrar(name);
	}

	@Override
	public List<Empleado> listar() {
		return empleadoDAO.findAll();
	}

	@Override
	public List<Empleado> listarFiltroNombre(String card) {		
		return empleadoDAO.listarCuyoNombreContiene(card);
	}

	@Override
	public List<Empleado> listarConJPA(Integer pId, String contiene) {		
		return empleadoDAO.findByIdGreaterThanAndNombreLike(pId, contiene);
	}

	@Override
	public void inserta(Empleado emp) {
		empleadoDAO.save(emp);
	}

}
