package com.noe.ChallengeInterbanking.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class EmpresaUnitTest {
	
	@Test
    void shouldCompleteEmpresa() {
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String fechaAdhesion = dtf.format(dateObj);
		final Empresa empresa = EmpresaProvider.getCreatedEmpresa();
        assertEquals(fechaAdhesion, empresa.getFechaAdhesion());
    }

	
}
