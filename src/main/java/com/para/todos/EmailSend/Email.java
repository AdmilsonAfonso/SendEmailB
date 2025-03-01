package com.para.todos.EmailSend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Email {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Texto texto) {
        SimpleMailMessage message = new SimpleMailMessage();


        

        message.setTo(texto.getDestinatario());
        message.setSubject(texto.getAssunto());
        message.setText(texto.getMsg());
        message.setFrom("admilsonkafelando30@gmail.com"); // Configurar e-mail do remetente
        mailSender.send(message);
    }
    
}
