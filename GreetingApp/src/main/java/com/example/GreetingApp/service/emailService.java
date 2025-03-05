package com.example.GreetingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class emailService {

    @Autowired
    private JavaMailSender mailSender;
    // Method to send an email notification
    public void sendEmailNotification(String email, String token) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Welcome to Our Platform - Please Verify Your Email");
        message.setText("Hello and welcome to our community!\n\n"
                + "Thank you for registering with us. We're excited to have you on board.\n\n"
                + "To complete your registration and activate your account, please verify your email address by using the following token:\n\n"
                + "Verification Token: " + token + "\n\n"
                + "If you did not register for an account, please ignore this message.\n\n"
                + "Best regards,\n"
                + "The GreetingAPP Team");
        mailSender.send(message);
    }
}
