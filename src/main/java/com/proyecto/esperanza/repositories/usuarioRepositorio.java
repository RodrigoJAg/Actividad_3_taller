package com.proyecto.esperanza.repositories;

import com.proyecto.esperanza.models.usuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepositorio extends JpaRepository<usuariosModel, Long> {
}
