package com.noe.ChallengeInterbanking.dominio;

import java.util.UUID;

/**
* clase central dentro de la lógica del negocio
* 
*/
public class Empresa {
	private UUID id;
	private String cuit;
	private String razonSocial;
	private String fechaAdhesion;
		
	
	public Empresa(final UUID id,final String cuit,final String razonSocial,final String fechaAdhesion) {
		this.id=id;
		this.cuit=cuit;
		this.razonSocial=razonSocial;
		this.fechaAdhesion=fechaAdhesion;		
	}
	
		
	
	public Empresa() {

	}



	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	



	public String getCuit() {
		return cuit;
	}



	public void setCuit(String cuit) {
		this.cuit = cuit;
	}



	public String getRazonSocial() {
		return razonSocial;
	}



	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}



	public String getFechaAdhesion() {
		return fechaAdhesion;
	}



	public void setFechaAdhesion(String fechaAdhesion) {
		this.fechaAdhesion = fechaAdhesion;
	}



	
	
	
}
