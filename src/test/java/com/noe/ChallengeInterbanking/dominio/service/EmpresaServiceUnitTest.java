package com.noe.ChallengeInterbanking.dominio.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.repository.EmpresaRepository;

/**
*  la idea es probar EmpresaServiceImp de forma independiente de la aplicación y la infraestructura
* 
*/
public class EmpresaServiceUnitTest {
	
	private EmpresaRepository empresaRepository;
	private EmpresaServiceImp tested;
	
	@BeforeEach
    void setUp() {
		empresaRepository = mock(EmpresaRepository.class);
        tested = new EmpresaServiceImp(empresaRepository);
    }

	@Test
    void shouldCreateEmpresa() {
		String fechaAdhesion = "26-09-2022";
		final UUID id = tested.createEmpresa("27301650947", "empresaPrueba EmpresaServiceImp",fechaAdhesion );

        verify(empresaRepository).save(any(Empresa.class));
        assertNotNull(id);
    }
}
