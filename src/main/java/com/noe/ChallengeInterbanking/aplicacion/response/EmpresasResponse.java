package com.noe.ChallengeInterbanking.aplicacion.response;

import java.util.ArrayList;
import java.util.List;

import com.noe.ChallengeInterbanking.dominio.Empresa;

public class EmpresasResponse {

	private List<Empresa>empresas=new ArrayList<Empresa>();
	

	public List<Empresa> getEmpresas() {
		return empresas;
	}	
	
	public void setEmpresas(List<Empresa>empresas) {
		this.empresas=empresas;
	}
}
