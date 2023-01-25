package com.noe.ChallengeInterbanking.dominio.service;

import java.util.Date;
import java.util.UUID;

public interface EmpresaService {
	UUID createEmpresa(String cuit,String razonSocial,Date fechaAdhesion);
}
