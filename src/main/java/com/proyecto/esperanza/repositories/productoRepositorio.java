package com.proyecto.esperanza.repositories;

import com.proyecto.esperanza.models.productosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepositorio extends JpaRepository<productosModel, Long> {
}
