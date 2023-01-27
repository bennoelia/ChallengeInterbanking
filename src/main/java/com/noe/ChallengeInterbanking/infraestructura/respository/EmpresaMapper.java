package com.noe.ChallengeInterbanking.infraestructura.respository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.noe.ChallengeInterbanking.dominio.Empresa;

public class EmpresaMapper implements RowMapper<Empresa> {
    
	@Override
    public Empresa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empresa empresa = new Empresa();

		//empresa.setId(rs.getInt("id"));
		empresa.setCuit(rs.getString("cuit"));
		empresa.setRazonSocial(rs.getString("razonSocial"));
		empresa.setFechaAdhesion(rs.getString("fechaAdhesion"));
        return empresa;
    }
}