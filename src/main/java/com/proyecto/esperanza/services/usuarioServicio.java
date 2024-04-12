package com.proyecto.esperanza.services;

import com.proyecto.esperanza.repositories.productoRepositorio;
import com.proyecto.esperanza.repositories.transaccionRepositorio;
import com.proyecto.esperanza.repositories.transaccionesRepositorio;
import com.proyecto.esperanza.repositories.usuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
