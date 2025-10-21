package com.armandodev.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROTINA")
public class RotinaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "NOME", nullable = true, length = 40)
    private String nome;
  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDSUBMENU", nullable = false)
    private SubMenuEntity submenu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SubMenuEntity getSubmenu() {
        return submenu;
    }

    public void setSubmenu(SubMenuEntity submenu) {
        this.submenu = submenu;
    }

}
