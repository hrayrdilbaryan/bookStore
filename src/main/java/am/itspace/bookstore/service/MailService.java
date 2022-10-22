package com.example.companyemployeespring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.persistence.Access;

@Service
@RequiredArgsConstructor
public class MailService {

    private final MailSender mailSender;
    @Async
    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        mailMessage.setFrom("poxos@mail.com");

        mailSender.send(mailMessage);

    }
}
