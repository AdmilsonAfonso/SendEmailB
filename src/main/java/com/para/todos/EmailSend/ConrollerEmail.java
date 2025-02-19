package com.para.todos.EmailSend;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ConrollerEmail {

    @Autowired
    private Email email;



    @Operation(summary = "Envia um e-mail", description = "Recebe os dados do e-mail e envia para o destinatário")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "E-mail enviado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Requisição inválida", content = @Content),
        @ApiResponse(responseCode = "500", description = "Erro interno no servidor", content = @Content)
    })
    @PostMapping("/enviar")
    public String postMethodName(@RequestBody Texto texto) {
        
        email.sendEmail(texto);
        
        return "enviado";
    }
    
    
}
