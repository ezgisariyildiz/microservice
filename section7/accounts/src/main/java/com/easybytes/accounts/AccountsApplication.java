package com.easybytes.accounts;

import com.easybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts micoservice REST API Documentation",
				description = "EasyBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ezgi Çağla Sarıyıldız",
						email = "ezgisariyildiz0@gmail.com",
						url = "https://github.com/ezgisariyildiz"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/ezgisariyildiz"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EasyBank Accounts microservice REST API Documentation",
				url = "https://ezgisariyildiz.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
