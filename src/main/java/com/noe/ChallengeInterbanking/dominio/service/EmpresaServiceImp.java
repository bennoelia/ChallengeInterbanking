package com.noe.ChallengeInterbanking.dominio.service;

import java.util.Date;
import java.util.UUID;

import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.repository.EmpresaRepository;

public class EmpresaServiceImp implements EmpresaService {
	private final EmpresaRepository empresaRepository;
	
	public EmpresaServiceImp(final EmpresaRepository empresaRepository) {
		this.empresaRepository=empresaRepository;
	}

	@Override
	public UUID createEmpresa(String cuit,String razonSocial,Date fechaAdhesion) {
		final Empresa empresa = new Empresa(UUID.randomUUID(), cuit,razonSocial,fechaAdhesion);
        empresaRepository.save(empresa);

        return empresa.getId();
	}
}
