package org.example.model;

public class EmailService{

    private String email;

    public EmailService(String email) {
        this.email = email;
    }

    public void sendEmail(){
        System.out.println("Email send to "+email);
    }


}
