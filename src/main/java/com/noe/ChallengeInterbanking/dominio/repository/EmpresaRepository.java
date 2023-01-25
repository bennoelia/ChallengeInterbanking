package com.noe.ChallengeInterbanking.dominio.repository;

import java.util.Optional;
import java.util.UUID;

import com.noe.ChallengeInterbanking.dominio.Empresa;

public interface EmpresaRepository {
	Optional<Empresa> findById(UUID id);

    void save(Empresa empresa);
}
