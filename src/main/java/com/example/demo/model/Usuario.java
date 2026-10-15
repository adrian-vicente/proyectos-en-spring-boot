package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name = "usuarios")
@NoArgsConstructor 
@AllArgsConstructor 
@Getter 
@Setter 
public class Usuario {

    // Declaración de atributos 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private Integer edad;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;

} // class