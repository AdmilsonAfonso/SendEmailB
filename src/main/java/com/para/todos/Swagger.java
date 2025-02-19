package com.para.todos;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "API para enviar email",
        version = "1.0",
        description = "Documentação da API de envio de email"
    )
)

@Configuration
public class Swagger {
    
}
