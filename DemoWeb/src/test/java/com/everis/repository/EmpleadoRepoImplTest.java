package com.everis.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.everis.repository.entity.Empleado;


@TestPropertySource(locations = "classpath:application-test.properties")
@SpringBootTest
public class EmpleadoRepoImplTest {

	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(EmpleadoRepoImplTest.class);
	
	@Autowired
	EmpleadoRepoJPA empleadoDAO;
		
	@Test
	void testListarCuyoNombreContiene () {
		empleadoDAO.deleteAll();
		
		Empleado e1 = new Empleado(1001, "AbcdWs", "A"); //Constructor con parámetros
		Empleado e2 = new Empleado(1002, "Abcdws", "A");
		Empleado e3 = new Empleado(1003, "Abcds", "Awa");
		Empleado e4 = new Empleado(1004, "Abcds", "AWa");
		Empleado e5 = new Empleado(1005, "aaa", "aaa");
		Empleado e6 = new Empleado(1006, "www", "aaa");
		
		empleadoDAO.save(e1);
		empleadoDAO.save(e2);
		empleadoDAO.save(e3);
		empleadoDAO.save(e4);
		empleadoDAO.save(e5);
		empleadoDAO.save(e6);
		
		List<Empleado> le = empleadoDAO.findAll();
		le =  empleadoDAO.listarCuyoNombreContiene("w");
		LOG.info(" ====> testListarCuyoNombreContiene: 'w' = " +le.size() );
		
		empleadoDAO.deleteAll();
		
		assertTrue(le.size() == 3);
	}
}