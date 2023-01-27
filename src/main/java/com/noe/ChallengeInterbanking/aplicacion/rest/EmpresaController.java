package com.noe.ChallengeInterbanking.aplicacion.rest;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noe.ChallengeInterbanking.aplicacion.request.CreateEmpresaRequest;
import com.noe.ChallengeInterbanking.aplicacion.response.CreateEmpresaResponse;
import com.noe.ChallengeInterbanking.aplicacion.response.EmpresasResponse;
import com.noe.ChallengeInterbanking.dominio.service.EmpresaService;

/**
* Este controlador adapta la interfaz RESTful exterior a nuestro dominio. 
* Lo hace llamando a los métodos apropiados desde EmpresaService (puerto)
* 
*/

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	
	private static final Logger LOG = LoggerFactory.getLogger(EmpresaController.class);
	private final EmpresaService empresaService;
	
	@Autowired
	public EmpresaController(EmpresaService empresaService) {
		this.empresaService=empresaService;
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateEmpresaResponse createEmpresa(@RequestBody final CreateEmpresaRequest createOrderRequest) {
		LOG.info("EmpresaController - llamado a /empresas ");
		final UUID id = empresaService.createEmpresa(createOrderRequest.getCuit(),createOrderRequest.getRazonSocial(),createOrderRequest.getFechaAdhesion());
        return new CreateEmpresaResponse(id);
    }
	
	@RequestMapping("/adheridasMesActual")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	EmpresasResponse obtenerAdheridasMesActual() {
		LOG.info("EmpresaController - llamado a /empresas/adheridasMesActual ");
		EmpresasResponse empresasResponse=empresaService.obtenerAdheridasMesActual();
		return empresasResponse;
    }
	
	@RequestMapping("/conTransferenciasMesActual")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	EmpresasResponse obtenerConTranferenciasMesActual() {
		LOG.info("EmpresaController - llamado a /empresas/conTransferenciasMesActual ");
		EmpresasResponse empresasResponse=empresaService.obtenerConTranferenciasMesActual();
		return empresasResponse;
    }
}
