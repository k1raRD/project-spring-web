/**
 * 
 */
package com.k1rard.projectspringweb.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k1rard.projectspringweb.dao.EmpleadoDAO;
import com.k1rard.projectspringweb.services.SpringService;

/**
 * @author k1rard
 */
@Service
public class SpringServiceImpl implements SpringService{
	
	@Autowired
	private EmpleadoDAO repository;

	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.repository.consultarNombreEmpleado();
	}

}
