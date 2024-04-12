package com.proyecto.esperanza;

import com.proyecto.esperanza.controllers.userController;
import com.proyecto.esperanza.dto.usuariosDTO;
import com.proyecto.esperanza.services.usuarioServicio;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class EsperanzaApplicationTests {
	@Autowired
	private userController controller;


	@Test
	void verificarUsuarioExistente() {
		assertTrue("usuario existente", controller.prueba("rodriaac"));
	}

	@Test
	void verificarUsuarioNoExitente() {
		assertFalse("usuario existente", controller.prueba("rodri"));
	}

}
