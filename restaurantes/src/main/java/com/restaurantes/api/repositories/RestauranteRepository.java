package com.restaurantes.api.repositories;

import com.restaurantes.api.entities.Restaurantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurantes, Long> {
    
    // Aquí puedes añadir métodos personalizados más adelante si lo necesitas
}
