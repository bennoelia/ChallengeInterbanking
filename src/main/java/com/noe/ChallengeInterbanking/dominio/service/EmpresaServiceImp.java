package com.noe.ChallengeInterbanking.dominio.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noe.ChallengeInterbanking.aplicacion.response.EmpresasResponse;
import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.repository.EmpresaRepository;

/**
* es la implementación de EmpresaService
* mediante inyección de dependencia de la interface empresaRepository hace que la lógica de negocio 
* sea independiente del cómo se persiste
*/
@Service
public class EmpresaServiceImp implements EmpresaService {
	private final EmpresaRepository empresaRepository;
	
	@Autowired
	public EmpresaServiceImp(final EmpresaRepository empresaRepository) {
		this.empresaRepository=empresaRepository;
	}

	@Override
	public UUID createEmpresa(String cuit,String razonSocial,String fechaAdhesion) {
		final Empresa empresa = new Empresa(UUID.randomUUID(), cuit,razonSocial,fechaAdhesion);
        empresaRepository.save(empresa);

        return empresa.getId();
	}
	
	@Override
	public EmpresasResponse obtenerAdheridasMesActual() {
		EmpresasResponse empresasResponse=new EmpresasResponse();
		empresasResponse.setEmpresas(empresaRepository.empresasAdheridasMesActual());
		return empresasResponse;
	}
	
	
	@Override
	public EmpresasResponse obtenerConTranferenciasMesActual() {
		EmpresasResponse empresasResponse=new EmpresasResponse();
		empresasResponse.setEmpresas(empresaRepository.empresasConTransfMesActual());
		return empresasResponse;
	}
}
