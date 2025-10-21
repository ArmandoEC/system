package com.armandodev.negocio;

import com.armandodev.entity.MenuEntity;
import com.armandodev.entity.SubMenuEntity;
import com.armandodev.service.MenuPrincipalService;
import java.util.List;


public class ParticipantesBO {
    
    public void salvarNovoParticipante() throws Exception {
        
        MenuPrincipalService service = new MenuPrincipalService();        
        List<MenuEntity> listMenu = service.buscarListMenu();
        
        for (MenuEntity e: listMenu) {            
            e.setSubmenus(service.buscarListSubMenu(e));
            for (SubMenuEntity x: e.getSubmenus()) {
                x.setRotinas(service.buscarListRotina(x));
            }
        }
        
        return listMenu;
        
    }
}
