package com.noe.ChallengeInterbanking.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmpresaUnitTest {
	
	@Test
    void shouldCompleteEmpresa() {
        final Empresa empresa = EmpresaProvider.getCreatedEmpresa();
        assertEquals("26-09-2022", empresa.getFechaAdhesion());
    }

	
}
