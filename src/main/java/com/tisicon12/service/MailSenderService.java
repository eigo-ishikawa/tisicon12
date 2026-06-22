package com.tisicon12.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * メール送信機能を提供するサービスクラス。
 */
@Service
public class MailSenderService {

    private final JavaMailSender mailSender;

    /** 送信元アドレス */
    private static final String FROM_ADDRESS = "mitsumori@example.com";

    public MailSenderService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * メール送信を行う。
     *
     * @param mailAddress メールアドレス
     * @param title       タイトル
     * @param content     本文
     */
    public void sendMail(String mailAddress, String title, String content) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mailAddress);
        message.setFrom(FROM_ADDRESS);
        message.setSubject(title);
        message.setText(content);
        mailSender.send(message);

    }
}
