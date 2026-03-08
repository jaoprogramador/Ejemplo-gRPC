package com.recetas.api.repositories;

import com.recetas.api.entities.Recetas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RecetaRepository extends JpaRepository<Recetas, Long> {

    /**
     * Método adicional útil: Buscar todas las recetas 
     * asociadas a un restaurante específico.
     * Equivalente a buscar alumnos por schoolId.
     */
    List<Recetas> findAllByRestauranteId(Long restauranteId);
    
}
