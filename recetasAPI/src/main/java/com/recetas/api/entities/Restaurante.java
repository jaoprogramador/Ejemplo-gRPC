package com.recetas.api.entities;

import lombok.*;
//import javax.persistence.*;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // Agregado para facilitar la creación de objetos en pruebas
public class Restaurante {

    private Long id;
    private String nombre;
    private String direccion;
    private String especialidad; // Ej: Italiana, Mexicana, Vegana
    private Integer status; // 1 para Activo, 0 para Inactivo
}
