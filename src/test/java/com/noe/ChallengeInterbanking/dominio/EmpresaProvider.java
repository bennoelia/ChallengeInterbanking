package com.noe.ChallengeInterbanking.dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class EmpresaProvider {
	public static Empresa getCreatedEmpresa() {
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String fechaAdhesion = dtf.format(dateObj);	
		return new Empresa(UUID.randomUUID(), "27301650947", "empresa Adherida el mes actual",fechaAdhesion );
	}
}
