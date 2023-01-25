package com.noe.ChallengeInterbanking.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.repository.EmpresaRepository;
import com.noe.ChallengeInterbanking.dominio.service.EmpresaServiceImp;

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
		String adhesion = "26-09-2022";
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    Date fechaAdhesion = null;
		try {
			fechaAdhesion = formatter.parse(adhesion);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		final UUID id = tested.createEmpresa("27301650947", "empresaPrueba",fechaAdhesion );

        verify(empresaRepository).save(any(Empresa.class));
        assertNotNull(id);
    }
}
