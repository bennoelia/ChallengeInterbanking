package com.noe.ChallengeInterbanking.infraestructura.respository;

import java.util.UUID;

import com.noe.ChallengeInterbanking.dominio.Empresa;


/**
* la usamos para persistir el dominio en la base de datos.
* 
*/
public class EmpresaEntity {

	 private UUID id;
	 private String cuit;
	 private String razonSocial;
	 private String fechaAdhesion;


	 public EmpresaEntity(UUID id, String cuit, String razonSocial,String fechaAdhesion ) {
		 this.id = id;	 
	     this.cuit=cuit;
	     this.razonSocial=razonSocial;
	     this.fechaAdhesion=fechaAdhesion;
	 }
	 
	 
      public EmpresaEntity() {
	    }

	  public EmpresaEntity(Empresa empresa) {
	        this.id = empresa.getId();
	        this.cuit = empresa.getCuit();
	        this.razonSocial = empresa.getRazonSocial();
	        this.fechaAdhesion=empresa.getFechaAdhesion();

	    }


	public void setId(UUID id) {
		this.id = id;
	}


	public void setCuit(String cuit) {
		this.cuit = cuit;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public void setFechaAdhesion(String fechaAdhesion) {
		this.fechaAdhesion = fechaAdhesion;
	}


		  
	  
}
