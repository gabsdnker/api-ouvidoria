package com.api_ouvidoria.api_ouvidoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_ouvidoria.api_ouvidoria.model.Ouvidoria;
import com.api_ouvidoria.api_ouvidoria.service.OuvidoriaService;

@RestController
@RequestMapping("/ouvidorias")
@CrossOrigin
public class OuvidoriaController {
    @Autowired
    private OuvidoriaService ouvidoriaService;

    //Métodos do controller para manipular as ouvidorias
    @PostMapping
    public void cadastrarOuvidoria(@RequestBody Ouvidoria ouvidoria) {
        ouvidoriaService.cadastrarOuvidoria(ouvidoria);
    }

    //Método para adicionar protocolo
    @PostMapping("/protocolo")
    public String protocoloOuvidoria() {
        return ouvidoriaService.protocoloOuvidoria();
    }

    //Método para adicionar data
    @PostMapping("/data")
    public String dataOuvidoria() {
        return ouvidoriaService.dataOuvidoria();
    }

    //Método para listar as ouvidorias
    @GetMapping //não ta indo
    public List<Ouvidoria> listarOuvidorias() {
        return ouvidoriaService.listarOuvidoria();
    }

    //Método de descrição da ouvidoria
    @GetMapping("/descricao")
    public Ouvidoria descricaoOuvidoria(@RequestBody Ouvidoria ouvidoria) {
        return ouvidoriaService.descricaoOuvidoria(ouvidoria);
    }

    //Método para visualizar a mídia da ouvidoria
    @GetMapping("/midia")
    public void verMidia(@RequestBody String midia) {
        ouvidoriaService.verMidia(midia);
    }

    //Método para obter a localização da ouvidoria
    @GetMapping("/localizacao")
    public String localizacaoOuvidoria(@RequestBody String localizacao) {
        return ouvidoriaService.localizacaoOuvidoria(localizacao);
    }

    //Método para atualizar uma ouvidoria
    @PutMapping
    public void atualizarOuvidoria(@RequestBody Ouvidoria ouvidoria) {
        ouvidoriaService.atualizarOuvidoria(ouvidoria);
    }

    //Método para editar uma ouvidoria
    @PutMapping("/{id}")
    public void editarOuvidoria(@PathVariable int id, @RequestBody Ouvidoria ouvidoria) {
        ouvidoriaService.editarOuvidoria(id, ouvidoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarOuvidoria(@PathVariable int id) {
        ouvidoriaService.deletarOuvidoria(id);
        return ResponseEntity.noContent().build();
    }

}
