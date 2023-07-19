/**
 * 
 */
package com.k1rard.projectspringweb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.k1rard.projectspringweb.services.SpringService;

/**
 * @author k1rard
 * Clase de prueba unitaria con Spring y Junit
 */
@SpringJUnitConfig(locations = {"classpath:applicationContext-test.xml"})
class SpringJunit {
	
	@Autowired
	private SpringService springService;

	@Test
	void test() {
		assertNotNull(springService);
		System.out.println(this.springService.mostrarNombreEmpleado()); 
	}

}
