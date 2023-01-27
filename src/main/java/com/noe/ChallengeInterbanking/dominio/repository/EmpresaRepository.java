package com.noe.ChallengeInterbanking.dominio.repository;

import java.util.List;

import com.noe.ChallengeInterbanking.dominio.Empresa;

/**
*interface que la lógica de negocio independiente del como se implementará la persistencia
*/
public interface EmpresaRepository {
	
    void save(Empresa empresa);
    
    // empresas que se adhirieron el ultimo mes.
    List <Empresa> empresasAdheridasMesActual();
    
    //empresas que hicieron transferencias el último mes
    List <Empresa> empresasConTransfMesActual();
}
