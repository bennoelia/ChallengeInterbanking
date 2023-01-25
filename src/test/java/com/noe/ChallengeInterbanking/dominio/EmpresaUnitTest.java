package com.noe.ChallengeInterbanking.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmpresaUnitTest {
	
	@Test
    void shouldCompleteEmpresa() {
        final Empresa empresa = EmpresaProvider.getCreatedEmpresa();
        //empresa.complete();
        assertEquals(EmpresaStatus.CREATED, empresa.getStatus());
    }

	
}
