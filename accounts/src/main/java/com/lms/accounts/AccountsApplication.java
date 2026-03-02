package com.lms.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/* If for eg we are not following the the convention of packages inside com.lms.accounts we need to explicitly mention
* where the controllers, respositories and models are.
* @ComponentScans({@ComponenetScan("com.lms.accounts.controller")})
* @EnableJpaRepositories("com.lms.accounts.repository")
* EntityScan("com.lms.accounts.model")
*  */
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title= "Accounts microservice REST API Documentation",
				description = "EazyBank Accounts microservice REST API Documenation.",
				version = "v1",
				contact = @Contact(
						name = "Siddharth Singh",
						email = "sid@gmail.com"
				),
				license = @License(
						name = "Apache.20",
						url = "dummy_url.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservice REST API Documentation",
				url = "dummy_url.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
