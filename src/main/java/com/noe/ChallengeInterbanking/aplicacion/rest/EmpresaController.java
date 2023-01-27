package com.noe.ChallengeInterbanking.aplicacion.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noe.ChallengeInterbanking.aplicacion.request.CreateEmpresaRequest;
import com.noe.ChallengeInterbanking.aplicacion.response.CreateEmpresaResponse;
import com.noe.ChallengeInterbanking.aplicacion.response.EmpresasResponse;
import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.service.EmpresaService;

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
        final UUID id = empresaService.createEmpresa(createOrderRequest.getCuit(),createOrderRequest.getRazonSocial(),createOrderRequest.getFechaAdhesion());

        return new CreateEmpresaResponse(id);
    }
	
	@RequestMapping("/adheridasMesActual")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	EmpresasResponse obtenerAdheridasMesActual() {
		EmpresasResponse empresasResponse=empresaService.obtenerAdheridasMesActual();
		return empresasResponse;
    }
	
	@RequestMapping("/conTransferenciasMesActual")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	EmpresasResponse obtenerConTranferenciasMesActual() {
		EmpresasResponse empresasResponse=empresaService.obtenerConTranferenciasMesActual();
		return empresasResponse;
    }
}
