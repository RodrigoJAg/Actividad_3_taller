package com.proyecto.esperanza.services;

import com.proyecto.esperanza.dto.usuariosDTO;
import com.proyecto.esperanza.models.usuariosModel;
import com.proyecto.esperanza.repositories.productoRepositorio;
import com.proyecto.esperanza.repositories.transaccionRepositorio;
import com.proyecto.esperanza.repositories.transaccionesRepositorio;
import com.proyecto.esperanza.repositories.usuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioServicio{
    @Autowired
    private productoRepositorio repositorioProducto;

    @Autowired
    private transaccionesRepositorio repositorioTransacciones;

    @Autowired
    private transaccionRepositorio repositorioTransaccion;

    @Autowired
    private usuarioRepositorio repositorioUsuarios;


    public List<usuariosModel> getUsers(){
        return (List<usuariosModel>) repositorioUsuarios.findAll();
    }

    public usuariosModel saveUser(usuariosDTO userDTO){
        usuariosModel user = new usuariosModel();

        user.setPassword(userDTO.getPassword());
        user.setUsername(userDTO.getUsername());

        return repositorioUsuarios.save(user);
    }



}
