package com.noe.ChallengeInterbanking.infraestructura.respository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.noe.ChallengeInterbanking.dominio.Empresa;
import com.noe.ChallengeInterbanking.dominio.repository.EmpresaRepository;

@Repository
@Primary
public class JdbcEmpresaRepository  implements EmpresaRepository {

	private JdbcTemplate plantilla;
	  
	public JdbcEmpresaRepository(JdbcTemplate plantilla) {
	    this.plantilla = plantilla;
	  }
	
	  @Transactional
	  public void save(Empresa empresa) {
		  int result = plantilla.queryForObject("SELECT COUNT(*) FROM empresas", Integer.class);
		  result=result+1;
		  plantilla.update("insert into empresas values (?,?,?,?)", result,empresa.getCuit(),empresa.getRazonSocial(),empresa.getFechaAdhesion());
	  }
	   	  
	  
	  @Override
	  public List <Empresa> empresasAdheridasMesActual(){
		  int mes=LocalDate.now().getMonthValue();
		  return plantilla.query("select * from empresas where Month(fechaAdhesion)=?",new EmpresaMapper(),mes);  
	  }
	  
	  @Override
	  public List <Empresa> empresasConTransfMesActual(){
		  int mes=LocalDate.now().getMonthValue();
		  return plantilla.query("SELECT * FROM challengedb.empresas as e\r\n"
		  		+ "WHERE EXISTS (select idEmpresa FROM challengedb.transferencias as t where Month(fechaTransferencia)=? and e.idEmpresa=t.idEmpresa)",new EmpresaMapper(),mes);
	  }
	  
}

