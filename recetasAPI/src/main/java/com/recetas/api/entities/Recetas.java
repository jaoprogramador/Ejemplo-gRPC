package com.recetas.api.entities;

import jakarta.persistence.*; // Importante: usamos jakarta para Spring Boot 4
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Recetas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recetas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ingredientes;
    private Long restauranteId; 
    private String origen;
    private Double precioSugerido;
    private Integer status;

}
