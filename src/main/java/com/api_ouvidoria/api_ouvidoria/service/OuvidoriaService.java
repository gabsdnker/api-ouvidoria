package com.api_ouvidoria.api_ouvidoria.service;

import java.util.List;

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

    //Botão de salvar ouvidoria no banco de dados
    public void cadastrarOuvidoria(Ouvidoria ouvidoria) {
        ouvidoriaRepo.save(ouvidoria);
    }

    //Gerar protocolo 
    public String protocoloOuvidoria() {
        //Aqui eu quero que seja gerado um protocolo único para a ouvidoria
        String protocoloUnico = "OUVIDORIA-" + System.currentTimeMillis();
        return protocoloUnico;
    }

    //Gerar data do dia da adição da ouvidoria
    public String dataOuvidoria() {
        // Aqui eu quero que seja gerada a data do dia da adição da ouvidoria
        String dataAtual = java.time.LocalDate.now().toString();
        return dataAtual;
    }

    //Descrição da ouvidoria
    public Ouvidoria descricaoOuvidoria(Ouvidoria ouvidoria) {
        return ouvidoria;
    }

    //Localização da ouvidoria
    public String localizacaoOuvidoria(String localizacao) {
        return localizacao;
    }

    //Tipo de ouvidoria
    public TipoOuvidoria tipoOuvidoria(TipoOuvidoria nome_tipo) {
        //Aqui eu quero que o usuario possa selecionar o tipo de ouvidoria entre as opçoes
        return nome_tipo;
    }

    //Area da ouvidoria
    public AreaOuvidoria areaOuvidoria(AreaOuvidoria nome_area) {
        //Aqui eu quero que o usuario possa selecionar o area de ouvidoria entre as opçoes
        return nome_area;
    }

    public void verMidia(String midia) {
        // Lógica para visualizar a mídia da ouvidoria
    }

    //Lista as ouvidorias
    public List<Ouvidoria> listarOuvidoria(){
        return ouvidoriaRepo.findAll();
    }

    //Edita a ouvidoria
    public void editarOuvidoria(int id, Ouvidoria ouvidoria) {
        ouvidoriaRepo.save(ouvidoria);
    }

    //Atualiza a ouvidoria
    public void atualizarOuvidoria(Ouvidoria ouvidoria) {
        ouvidoriaRepo.save(ouvidoria);
    }

    //Deleta a ouvidoria
    public void deletarOuvidoria(int id) {
        ouvidoriaRepo.deleteById(id);
    }

}
