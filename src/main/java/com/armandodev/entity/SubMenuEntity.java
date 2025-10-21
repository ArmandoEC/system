package com.armandodev.entity;

import java.io.Serializable;
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

@Entity
@Table(name = "SUBMENU")
public class SubMenuEntity implements Serializable {

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
    @JoinColumn(name = "IDMENU", nullable = false)
    private MenuEntity menu;
    
    @OneToMany(mappedBy = "submenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RotinaEntity> rotinas;

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

    public MenuEntity getMenu() {
        return menu;
    }

    public void setMenu(MenuEntity menu) {
        this.menu = menu;
    }

    public List<RotinaEntity> getRotinas() {
        return rotinas;
    }

    public void setRotinas(List<RotinaEntity> rotinas) {
        this.rotinas = rotinas;
    }
    
    @Override
    public String toString() {
        return getCodigo() + " - " + getNome();
    }
    
}
