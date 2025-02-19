package com.para.todos.EmailSend;

public class Texto {

    private String destinatario;
    private String assunto;
    private String msg;

    
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Texto(String destinatario, String assunto, String msg) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.msg = msg;
    }
   

    
}
