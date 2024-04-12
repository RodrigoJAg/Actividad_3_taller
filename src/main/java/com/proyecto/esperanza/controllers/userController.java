package com.proyecto.esperanza.controllers;

import com.proyecto.esperanza.dto.productosDTO;
import com.proyecto.esperanza.dto.transaccionesDTO;
import com.proyecto.esperanza.dto.usuariosDTO;
import com.proyecto.esperanza.services.usuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class userController {

    @Autowired
    private usuarioServicio servicioUsuario;

    @ModelAttribute("usuario")
    public usuariosDTO newUser() {
        return new usuariosDTO();
    }

    @ModelAttribute("producto")
    public productosDTO newProduct() {
        return new productosDTO();
    }

    @ModelAttribute("transaccion")
    public transaccionesDTO newTrans() {
        return new transaccionesDTO();
    }

}
