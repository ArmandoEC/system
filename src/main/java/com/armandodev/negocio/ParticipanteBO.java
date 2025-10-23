package com.armandodev.negocio;

import com.armandodev.entity.ParticipanteEntity;
import com.armandodev.exception.ErrorException;
import com.armandodev.service.ParticipanteService;


public class ParticipanteBO {
    
    public void salvarParticipante(ParticipanteEntity participante) throws ErrorException {
        
        try {
            
            if (participante.getCodigo() == null) {
                new ParticipanteService().salvarNovoParticipante(participante);
            } else {
                new ParticipanteService().alterarParticipante(participante);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ErrorException("Erro ao salvar Participante!");
        }
        
    }
}
