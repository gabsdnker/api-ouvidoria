package com.api_ouvidoria.api_ouvidoria.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_ouvidoria.api_ouvidoria.model.Ouvidoria;
import com.api_ouvidoria.api_ouvidoria.model.enums.AreaOuvidoria;
import com.api_ouvidoria.api_ouvidoria.model.enums.TipoOuvidoria;
import com.api_ouvidoria.api_ouvidoria.repo.OuvidoriaRepo;

@Service
public class OuvidoriaService {
    
    @Autowired
    private OuvidoriaRepo ouvidoriaRepo;

    // Cadastrar ouvidoria
    public Ouvidoria cadastrarOuvidoria(Ouvidoria ouvidoria) {
        ouvidoria.setProtocolo(protocoloOuvidoria());
        ouvidoria.setData(dataOuvidoria());
        return ouvidoriaRepo.save(ouvidoria);
    }

    // Gerar protocolo único
    public String protocoloOuvidoria() {
        return "OUV-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    // Gerar data do dia
    public LocalDate dataOuvidoria() {
        return LocalDate.now();
    }

    // Tipo de ouvidoria
    public TipoOuvidoria tipoOuvidoria(TipoOuvidoria tipo) {
        return tipo;
    }

    // Área da ouvidoria
    public AreaOuvidoria areaOuvidoria(AreaOuvidoria area) {
        return area;
    }

    // Listar todas
    public List<Ouvidoria> listarOuvidoria(){
        return ouvidoriaRepo.findAll();
    }

    // Buscar por ID
    public Optional<Ouvidoria> buscarPorProtocolo(String protocolo) {
        return ouvidoriaRepo.findByProtocolo(protocolo);
    }

    // Atualizar (com verificação se existe)
    public Ouvidoria atualizarOuvidoria(int id, Ouvidoria novaOuvidoria) {
        return ouvidoriaRepo.findById(id).map(ouvidoria -> {
            ouvidoria.setDescricao(novaOuvidoria.getDescricao());
            ouvidoria.setLocalizacao(novaOuvidoria.getLocalizacao());
            ouvidoria.setNome_tipo(novaOuvidoria.getNome_tipo());
            ouvidoria.setNome_area(novaOuvidoria.getNome_area());
            ouvidoria.setMidia(novaOuvidoria.getMidia());
            return ouvidoriaRepo.save(ouvidoria);
        }).orElseThrow(() -> new RuntimeException("Ouvidoria não encontrada!"));
    }

    // Deletar
    public void deletarOuvidoria(int id) {
        ouvidoriaRepo.deleteById(id);
    }
}
