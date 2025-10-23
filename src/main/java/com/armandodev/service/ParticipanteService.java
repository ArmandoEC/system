package com.armandodev.service;

import com.armandodev.entity.ParticipanteEntity;
import com.armandodev.util.jpa.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.persistence.EntityManager;

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
            sql.append("UPDATE PARTICIPANTE SET NOME = ?, ATIVO = ? WHERE CODIGO = ? ");

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
    
}
