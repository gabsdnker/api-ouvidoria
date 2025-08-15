package com.api_ouvidoria.api_ouvidoria.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_ouvidoria.api_ouvidoria.model.Ouvidoria;

public interface OuvidoriaRepo extends JpaRepository<Ouvidoria, Integer> {
    
}
