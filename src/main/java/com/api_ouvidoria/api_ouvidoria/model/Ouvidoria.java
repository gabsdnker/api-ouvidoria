package com.api_ouvidoria.api_ouvidoria.model;

import com.api_ouvidoria.api_ouvidoria.model.enums.AreaOuvidoria;
import com.api_ouvidoria.api_ouvidoria.model.enums.TipoOuvidoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe que representa o modelo de Ouvidoria.
 * Contém os atributos e métodos necessários para manipular as informações de uma ouvidoria.
 */

@Entity
@Table(name = "ouvidoria")
public class Ouvidoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ouvidoria")
    private int id_ouvidoria;

    @Column(name = "protocolo")
    private String protocolo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "midia")
    private String midia;

    @Column(name = "localizacao")
    private String localizacao;

    @Column(name = "data")
    private String data;

    @Enumerated(EnumType.STRING)
    private TipoOuvidoria nome_tipo;

    @Enumerated(EnumType.STRING)
    private AreaOuvidoria nome_area;

    //Construtor vazio
    public Ouvidoria() {
    }

    //Construtor com atributos
    public Ouvidoria(int id_ouvidoria, String protocolo, String descricao, String midia, String localizacao, String data,TipoOuvidoria nome_tipo, AreaOuvidoria nome_area) {
        this.id_ouvidoria = id_ouvidoria;
        this.protocolo = protocolo;
        this.descricao = descricao;
        this.midia = midia;
        this.localizacao = localizacao;
        this.data = data;
        this.nome_tipo = nome_tipo;
        this.nome_area = nome_area;
    }

    //Getters e Setters
    public int getId_ouvidoria() {
        return id_ouvidoria;
    }
    public void setId_ouvidoria(int id_ouvidoria) {
        this.id_ouvidoria = id_ouvidoria;
    }



    public String getProtocolo() {
        return protocolo;
    }
    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }



    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public String getMidia() {
        return midia;
    }
    public void setMidia(String midia) {
        this.midia = midia;
    }


    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }



    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }



    public TipoOuvidoria getNome_tipo() {
        return nome_tipo;
    }
    public void setNome_tipo(TipoOuvidoria nome_tipo) {
        this.nome_tipo = nome_tipo;
    }



    public AreaOuvidoria getNome_area() {
        return nome_area;
    }
    public void setNome_area(AreaOuvidoria nome_area) {
        this.nome_area = nome_area;
    }
}
