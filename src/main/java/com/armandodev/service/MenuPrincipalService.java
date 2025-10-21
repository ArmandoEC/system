package com.armandodev.service;

import com.armandodev.entity.MenuEntity;
import com.armandodev.entity.RotinaEntity;
import com.armandodev.entity.SubMenuEntity;
import com.armandodev.util.jpa.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class MenuPrincipalService {
    
    public List<MenuEntity> buscarListMenu() throws Exception {

        EntityManager manager = ConnectionFactory.getConnection();
        String jpql = "select e from MenuEntity e \n";
        TypedQuery<MenuEntity> query = manager.createQuery(jpql, MenuEntity.class);

        return query.getResultList();

    }
    
    public List<SubMenuEntity> buscarListSubMenu(MenuEntity menu) throws Exception {

        EntityManager manager = ConnectionFactory.getConnection();
        String jpql = "select e from SubMenuEntity e where e.menu.id = " + menu.getCodigo();
        TypedQuery<SubMenuEntity> query = manager.createQuery(jpql, SubMenuEntity.class);

        return query.getResultList();

    }
    
    public List<RotinaEntity> buscarListRotina(SubMenuEntity subMenu) throws Exception {

        EntityManager manager = ConnectionFactory.getConnection();
        String jpql = "select e from RotinaEntity e where e.submenu.id = " + subMenu.getId();
        TypedQuery<RotinaEntity> query = manager.createQuery(jpql, RotinaEntity.class);

        return query.getResultList();

    }
    
}
