//package com.apocalypse.demuu.controller;
//
//import com.apocalypse.demuu.service.MailService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequiredArgsConstructor
//public class MailController {
//    private final MailService mailService;
//
//    @ResponseBody
//    @PostMapping("/signup/mail")
//    public String MailSend(String mail) {
//        int number = mailService.sendMail(mail);
//        String num = "" + number;
//        return num;
//    }
//}
