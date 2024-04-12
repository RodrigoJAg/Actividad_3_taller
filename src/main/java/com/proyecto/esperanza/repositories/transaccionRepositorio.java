package com.proyecto.esperanza.repositories;

import com.proyecto.esperanza.models.transaccionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transaccionRepositorio extends JpaRepository<transaccionModel, Long> {
}
