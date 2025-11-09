package com.armandodev.negocio;

import com.armandodev.entity.GrupoContaEntity;
import com.armandodev.filter.GrupoContaFilter;
import com.armandodev.service.GrupoContaService;
import com.armandodev.util.Utils;
import java.util.ArrayList;
import java.util.List;


public class GrupoContaBO {
    
    public List<GrupoContaEntity> buscarGruposContaTreeModel() throws Exception {
        
        GrupoContaService service = new GrupoContaService();
        List<GrupoContaEntity> listGrupoConta = new ArrayList<>();
        GrupoContaFilter filter = new GrupoContaFilter();
        
        filter.setNivel(1);
        listGrupoConta.addAll(service.buscarGruposConta(filter));
        
        for (GrupoContaEntity e: listGrupoConta) {
            this.buscarSubGrupos(e,service);
        }
        
        filter = null;
        service = null;
        return listGrupoConta;
        
    }
    
    private void buscarSubGrupos(GrupoContaEntity grupoConta, GrupoContaService service) throws Exception {
        
        GrupoContaFilter filter = new GrupoContaFilter();
        filter.setGrupo(grupoConta);
        grupoConta.setSubGrupos(service.buscarGruposConta(filter));
        
        if (!Utils.isNullOrEmpty(grupoConta.getSubGrupos())) { 
            
            for (GrupoContaEntity e: grupoConta.getSubGrupos()) {
                this.buscarSubGrupos(e,service);
            }
            
        } else {
            grupoConta.setUltimoNivel(true);
        }
        
        filter = null;
       
    }
    
    public void salvarConta(GrupoContaEntity grupoConta) throws Exception {
        
        if (grupoConta.getId() == null) {
            new GrupoContaService().salvarNovaConta(grupoConta);
        } else {
            new GrupoContaService().alterarConta(grupoConta);
        }
        
    }
    
}
