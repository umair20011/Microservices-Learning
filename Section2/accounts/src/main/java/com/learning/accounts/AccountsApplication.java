package com.learning.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwwareImpl")
@OpenAPIDefinition(
        info=@Info(
                title = "Accounts microservice REST API Documentation",
                description = "MyBank Accounts microservice REST API Documentation",
                version = "V1",
                contact = @Contact(
                        name = "Danish Maniyar",
                        email = "danishmaniyar2109@gmail.com",
                        url="http:mybank/bank"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http:license/apache"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "MyBank Accounts microservices REST API Documentation",
                url = "http:externalDoc/read"
        )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
