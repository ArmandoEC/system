package com.armandodev.service;

import com.armandodev.entity.GrupoContaEntity;
import com.armandodev.filter.GrupoContaFilter;
import com.armandodev.util.jpa.ConnectionFactory;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GrupoContaService {
    
    public List<GrupoContaEntity> buscarGruposConta(GrupoContaFilter filter) throws Exception {
        
        EntityManager manager = ConnectionFactory.getConnection(); 
        
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT GC.ID, GC.NOME, GC.IDGRUPO, GC.NIVEL \n");
        sql.append("FROM GRUPOCONTA GC \n");
        sql.append("WHERE GC.ID IS NOT NULL \n");
        
        if (filter.getNivel() != null) sql.append("	AND GC.NIVEL = :NIVEL \n");
        if (filter.getId() != null) sql.append("	AND GC.ID = :ID \n");
        if (filter.getGrupo() != null) sql.append("	AND GC.IDGRUPO = :IDGRUPO \n");
        
        Query query = manager.createNativeQuery(sql.toString()); 
        
        if (filter.getNivel() != null) {
            query.setParameter("NIVEL", filter.getNivel());
        }
        
        if (filter.getId() != null) {
            query.setParameter("ID", filter.getId());
        }
        
        if (filter.getGrupo() != null) {
            query.setParameter("IDGRUPO", filter.getGrupo().getId());
            sql.append("	AND GC.IDGRUPO = :IDGRUPO \n");
        }
        
        List<Object[]> listResults = query.getResultList();        
        List<GrupoContaEntity> listResult = new ArrayList<>();
        GrupoContaEntity result;
        
        for (Object[] record : listResults) {

            result = new GrupoContaEntity();
            result.setId(((BigInteger) record[0]).longValue());
            result.setNome((String) record[1]);
            result.setGrupo((Integer) record[2] != null ? new GrupoContaEntity(((BigInteger) record[0]).longValue()) : null);
            result.setNivel((Integer) record[3]);

            listResult.add(result);
            
        }
        
        sql = null;
        query = null;
        manager = null;
        return listResult;
        
    }
    
}
