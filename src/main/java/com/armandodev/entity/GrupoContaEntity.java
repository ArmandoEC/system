package com.armandodev.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "GRUPOCONTA")
public class GrupoContaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "NOME", nullable = false, length = 60)
    private String nome;
  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDGRUPO")
    private GrupoContaEntity grupo;
    
    @OneToMany(mappedBy = "IDGRUPO", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<GrupoContaEntity> subGrupos = new ArrayList<>();

    @Column(name = "NIVEL", nullable = false)
    private Integer nivel;
    
    @Transient
    private boolean ultimoNivel;

    public GrupoContaEntity() {
    }

    public GrupoContaEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GrupoContaEntity getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoContaEntity grupo) {
        this.grupo = grupo;
    }

    public List<GrupoContaEntity> getSubGrupos() {
        return subGrupos;
    }

    public void setSubGrupos(List<GrupoContaEntity> subGrupos) {
        this.subGrupos = subGrupos;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public boolean isUltimoNivel() {
        return ultimoNivel;
    }

    public void setUltimoNivel(boolean ultimoNivel) {
        this.ultimoNivel = ultimoNivel;
    }

}
