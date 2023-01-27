package com.noe.ChallengeInterbanking.infraestructura.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.noe.ChallengeInterbanking.ChallengeInterbankingApplication;
import com.noe.ChallengeInterbanking.dominio.repository.EmpresaRepository;
import com.noe.ChallengeInterbanking.dominio.service.EmpresaService;
import com.noe.ChallengeInterbanking.dominio.service.EmpresaServiceImp;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackageClasses = ChallengeInterbankingApplication.class)
public class BeanConfiguration {

	@Bean
    EmpresaService empresaService(final EmpresaRepository empresaRepository) {
        return new EmpresaServiceImp(empresaRepository);
    }
}
