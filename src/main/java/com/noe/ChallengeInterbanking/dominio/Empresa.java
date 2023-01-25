package com.noe.ChallengeInterbanking.dominio;

import java.util.Date;
import java.util.UUID;

public class Empresa {
	private UUID id;
	private String cuit;
	private String razonSocial;
	private Date fechaAdhesion;
	private EmpresaStatus status;
	
	
	public Empresa(final UUID id,final String cuit,final String razonSocial,final Date fechaAdhesion) {
		this.id=id;
		this.cuit=cuit;
		this.razonSocial=razonSocial;
		this.fechaAdhesion=fechaAdhesion;
		this.status = EmpresaStatus.CREATED;
	}
	
		
	
	public void complete() {
        validateState();
        this.status = EmpresaStatus.COMPLETED;
    }
	
	private void validateState() {
	        if (EmpresaStatus.COMPLETED.equals(status)) {
	            throw new RuntimeException("The order is in completed state.");
	        	
	        }
	}

	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public EmpresaStatus getStatus() {
		return status;
	}
}
