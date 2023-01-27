package com.noe.ChallengeInterbanking.aplicacion.request;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEmpresaRequest {

	private UUID id;
	private String cuit;
	private String razonSocial;
	private String fechaAdhesion;
	
	@JsonCreator
	public CreateEmpresaRequest(@JsonProperty("cuit") @NotNull final String cuit,@JsonProperty("razonSocial") @NotNull final String razonSocial,@JsonProperty("fechaAdhesion") @NotNull final String fechaAdhesion) {
		this.cuit=cuit;
		this.razonSocial=razonSocial;
		this.fechaAdhesion=fechaAdhesion;
	}

	public UUID getId() {
		return id;
	}

	public String getCuit() {
		return cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public String getFechaAdhesion() {
		return fechaAdhesion;
	}
	
	
}
