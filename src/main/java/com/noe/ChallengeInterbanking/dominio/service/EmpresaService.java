package com.noe.ChallengeInterbanking.dominio.service;

import java.util.UUID;

import com.noe.ChallengeInterbanking.aplicacion.response.EmpresasResponse;

public interface EmpresaService {
	UUID createEmpresa(String cuit,String razonSocial,String fechaAdhesion);
	EmpresasResponse obtenerAdheridasMesActual();
	EmpresasResponse obtenerConTranferenciasMesActual();
}
