package com.noe.ChallengeInterbanking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.EmpresaProvider;
import com.noe.ChallengeInterbanking.infraestructura.respository.JdbcEmpresaRepository;

/**
*  clase para prueba global de la aplicación, la idea es que todas las empresas
*  se encuentren dadas de alta con anterioridad al mes actual.
*  y sólo 2 empresas poseen transferencias realizadas este mes. Por tal motivo se incluyó 
*  la fecha de transferencia como dato importante dentro del dominio del problema 
* 
*/

@SpringBootTest
class ChallengeInterbankingApplicationTests {

	@Autowired
	JdbcEmpresaRepository repositorio;
	
	@Test
	void contextLoads() {
	}

	
	  
	  @Test
	  void insertarPersona() {
		Empresa empresa= EmpresaProvider.getCreatedEmpresa(); 
	    repositorio.save(empresa);
	    List<Empresa> lista=repositorio.empresasAdheridasMesActual();
	    assertEquals(1,lista.size());
	    
	  }
	  
	  @Test
	  void testEmpresasConTransfMesActual() {
		  List<Empresa> lista=repositorio.empresasConTransfMesActual();
		   assertEquals(2,lista.size());
	  }
	  
	
}
