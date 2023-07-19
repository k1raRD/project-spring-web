/**
 * 
 */
package com.k1rard.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.k1rard.projectspringweb.dao.EmpleadoDAO;

/**
 * @author k1rard
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Alex collado";
	}

}
