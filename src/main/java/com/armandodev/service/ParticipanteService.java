package com.armandodev.service;

import com.armandodev.entity.ParticipanteEntity;
import com.armandodev.filter.ParticipanteFilter;
import com.armandodev.util.jpa.ConnectionFactory;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.commons.lang.StringUtils;

public class ParticipanteService {
    
    public void salvarNovoParticipante(ParticipanteEntity participante) throws Exception {
        
        EntityManager manager = ConnectionFactory.getConnection();        
        ConnectionFactory.begin();
        manager.persist(participante);
        ConnectionFactory.commit();    
        
        manager = null;
        
    }
    
    public void alterarParticipante(ParticipanteEntity participante) throws Exception {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
        
            StringBuffer sql = new StringBuffer();
            sql.append("UPDATE PARTICIPANTES SET NOME = ?, ATIVO = ? WHERE CODIGO = ? ");

            con = ConnectionFactory.getConnectionJDBC2();
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, participante.getNome());
            pstmt.setInt(2, participante.getAtivo() ? 1 : 0);
            pstmt.setLong(3, participante.getCodigo());
            pstmt.executeUpdate();
            
            sql = null;

        } finally {
            ConnectionFactory.fechaObjetosBanco(con, null, pstmt);
        }

    }
    
    public List<ParticipanteEntity> buscarParticipantes(ParticipanteFilter filter) throws Exception {
        
        EntityManager manager = ConnectionFactory.getConnection(); 
        
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT P.CODIGO, P.NOME, P.ATIVO \n");
        sql.append("FROM PARTICIPANTES P \n");
        sql.append("WHERE P.CODIGO IS NOT NULL \n");
        
        if (filter.getCodigo() != null) sql.append("	AND P.CODIGO = :CODIGO \n");
        if (StringUtils.isNotBlank(filter.getNome())) sql.append("	AND P.NOME LIKE :NOME \n");
        if (StringUtils.isNotBlank(filter.getAtivo()) && !filter.getAtivo().equals("Todos")) sql.append("	AND P.ATIVO = :ATIVO \n");
        
        Query query = manager.createNativeQuery(sql.toString()); 
        
        if (filter.getCodigo() != null) {
            query.setParameter("CODIGO", filter.getCodigo());
        }
        
        if (StringUtils.isNotBlank(filter.getNome())) {
            query.setParameter("NOME", "%" + filter.getNome() + "%");
        }
        
        if (StringUtils.isNotBlank(filter.getAtivo()) && !filter.getAtivo().equals("Todos")) {
            query.setParameter("ATIVO", filter.getAtivo().equals("Ativos") ? 1 : 0);
        }
        
        List<Object[]> listResults = query.getResultList();        
        List<ParticipanteEntity> listResult = new ArrayList<>();
        ParticipanteEntity result;
        
        for (Object[] record : listResults) {

            result = new ParticipanteEntity();
            result.setCodigo(((BigInteger) record[0]).longValue());
            result.setNome((String) record[1]);
            result.setAtivo(((byte) record[2] == 1) ? true : false);

            listResult.add(result);
            
        }
        
        sql = null;
        query = null;
        manager = null;
        return listResult;
        
    }
    
}
