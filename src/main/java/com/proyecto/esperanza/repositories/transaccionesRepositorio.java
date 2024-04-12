package com.proyecto.esperanza.repositories;

import com.proyecto.esperanza.models.transaccionesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transaccionesRepositorio extends JpaRepository<transaccionesModel, Long> {
}
