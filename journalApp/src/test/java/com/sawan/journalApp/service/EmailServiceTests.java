package com.sawan.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;
    @Test
    void testSendEmail()
    {
        emailService.sendEmail("pagadim928@endibit.com","Testing java EMAIL Sender","Hi, App Kaise Ho");
    }

}
