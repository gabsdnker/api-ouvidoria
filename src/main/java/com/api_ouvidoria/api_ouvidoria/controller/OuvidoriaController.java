package com.api_ouvidoria.api_ouvidoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api_ouvidoria.api_ouvidoria.model.Ouvidoria;
import com.api_ouvidoria.api_ouvidoria.service.OuvidoriaService;

@RestController
@RequestMapping("/ouvidorias")
@CrossOrigin
public class OuvidoriaController {
    
    @Autowired
    private OuvidoriaService ouvidoriaService;

    // Criar nova ouvidoria (gera protocolo e data automaticamente)
    @PostMapping
    public ResponseEntity<Ouvidoria> cadastrarOuvidoria(@RequestBody Ouvidoria ouvidoria) {
        Ouvidoria nova = ouvidoriaService.cadastrarOuvidoria(ouvidoria);
        return ResponseEntity.ok(nova);
    }

    // Listar todas
    @GetMapping
    public List<Ouvidoria> listarOuvidorias() {
        return ouvidoriaService.listarOuvidoria();
    }

    // Buscar por ID
    @GetMapping("/{protocolo}")
    public ResponseEntity<Ouvidoria> buscarOuvidoria(@PathVariable String protocolo) {
        return ouvidoriaService.buscarPorProtocolo(protocolo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar por ID
    @PutMapping("/{id}")
    public ResponseEntity<Ouvidoria> atualizarOuvidoria(@PathVariable int id, @RequestBody Ouvidoria ouvidoria) {
        try {
            Ouvidoria atualizada = ouvidoriaService.atualizarOuvidoria(id, ouvidoria);
            return ResponseEntity.ok(atualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Deletar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarOuvidoria(@PathVariable int id) {
        ouvidoriaService.deletarOuvidoria(id);
        return ResponseEntity.noContent().build();
    }
}
