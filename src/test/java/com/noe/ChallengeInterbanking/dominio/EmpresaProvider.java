package com.noe.ChallengeInterbanking.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class EmpresaProvider {
	public static Empresa getCreatedEmpresa() {
		String adhesion = "26-09-2022";
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    Date fechaAdhesion = null;
		try {
			fechaAdhesion = formatter.parse(adhesion);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return new Empresa(UUID.randomUUID(), "27301650947", "empresaPrueba",fechaAdhesion );
	}
}
