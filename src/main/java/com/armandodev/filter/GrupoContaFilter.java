package com.armandodev.filter;

import com.armandodev.entity.GrupoContaEntity;

public class GrupoContaFilter {

    private Long id;
    private Integer nivel;
    
    private GrupoContaEntity grupo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public GrupoContaEntity getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoContaEntity grupo) {
        this.grupo = grupo;
    }
    
}
