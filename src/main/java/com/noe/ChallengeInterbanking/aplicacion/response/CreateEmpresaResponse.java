package com.noe.ChallengeInterbanking.aplicacion.response;

import java.util.UUID;

public class CreateEmpresaResponse {
	private final UUID id;

    public CreateEmpresaResponse(final UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
