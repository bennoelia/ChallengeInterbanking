package com.noe.ChallengeInterbanking.dominio.service;

import java.util.UUID;

import com.noe.ChallengeInterbanking.aplicacion.response.EmpresasResponse;

/**
* es la interface donde se define la API para comunicarse con partes externas al dominio
* 
*/

public interface EmpresaService {
	UUID createEmpresa(String cuit,String razonSocial,String fechaAdhesion);
	EmpresasResponse obtenerAdheridasMesActual();
	EmpresasResponse obtenerConTranferenciasMesActual();
}
