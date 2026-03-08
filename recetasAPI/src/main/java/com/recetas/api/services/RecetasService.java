package com.recetas.api.services;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.recetas.api.entities.Recetas;

public interface RecetasService {
	CompletableFuture<Recetas> save(Recetas receta);
    CompletableFuture<Recetas> getOneById(Long id);
    CompletableFuture<List<Recetas>> getAll();
    CompletableFuture<Recetas> update(Recetas recetas, Long id);
    CompletableFuture<Recetas> delete(Long id);

}
