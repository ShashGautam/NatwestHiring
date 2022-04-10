package com.natwest.hiring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.domain}")
    String host;

    @GetMapping("/")
    public String sendControllers() {
        String Message = "Use this Controller: " + host + "app/v1/transaction  with Method: POST" +
                "<br><br>" + "Sample JSON format:" + "<br>" + " {\"AccountNumber\":\"1234455756\",\"Type\":\"Debit\",\"Amount\":\"12903920\",\"Currency\":\"INR\",\"AccountFrom\":\"89458545\"}" +
                "<br><br>" + "It will store your data in h2 using controller: " + host + "app/v1/transaction/queue" +
                "<br><br>" + "You can access DB via " + host + "h2-console" +
                "<br><br>" + "DB Creds can be used as such:" +
                "<br><br>" + "Username: root" +
                "<br>" + "Password: root1234" +
                "<br>" + "JDBC URL: jdbc:h2:~/AccountTransaction";
        return Message;
    }
}
