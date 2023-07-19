/**
 * 
 */
package com.k1rard.projectspringweb.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.k1rard.projectspringweb.services.SpringService;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

/**
 * @author k1rard
 * Controlador de ejemplo para demostrar la integracion de spring con JSF.
 */
@Named
@ViewScoped
public class SpringJSFController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombreEmpresa;
	
	private String nombreEmpleado;
	
	@Autowired
	private SpringService service;
	
	@PostConstruct
	public void init() {
		String nombre = this.service.mostrarNombreEmpresa(); 
		System.out.println(nombre);
		this.nombreEmpresa = nombre;
		this.nombreEmpleado = this.service.mostrarNombreEmpleado();
		System.out.println("El nombre del empleado es: " + nombreEmpleado);
	}

	/**
	 * @return the service
	 */
	public SpringService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(SpringService service) {
		this.service = service;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
	
}

