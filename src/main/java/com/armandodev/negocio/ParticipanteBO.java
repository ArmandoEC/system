package com.armandodev.negocio;

import com.armandodev.entity.ParticipanteEntity;
import com.armandodev.filter.ParticipanteFilter;
import com.armandodev.service.ParticipanteService;
import java.util.List;


public class ParticipanteBO {
    
    public void salvarParticipante(ParticipanteEntity participante) throws Exception {

        if (participante.getCodigo() == null) {
            new ParticipanteService().salvarNovoParticipante(participante);
        } else {
            new ParticipanteService().alterarParticipante(participante);
        }

    }
    
    public List<ParticipanteEntity> buscarParticipantes(ParticipanteFilter filter) throws Exception {
        return new ParticipanteService().buscarParticipantes(filter);
    }
    
}
