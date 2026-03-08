package com.restaurantes.api.services;

import com.restaurantes.api.entities.Restaurantes;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface RestauranteService {
    
    // Guardar un nuevo restaurante
    CompletableFuture<Restaurantes> save(Restaurantes restaurante);
    
    // Obtener un restaurante por su ID
    CompletableFuture<Restaurantes> getOneById(Long id);
    
    // Obtener el listado de todos los restaurantes
    CompletableFuture<List<Restaurantes>> getAll();
    
    // Actualizar un restaurante existente
    CompletableFuture<Restaurantes> update(Restaurantes restaurante, Long id);
    
    // Eliminar un restaurante (normalmente borrado lógico mediante status)
    CompletableFuture<Restaurantes> delete(Long id);
}
