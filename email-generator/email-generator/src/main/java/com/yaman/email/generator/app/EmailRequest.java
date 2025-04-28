package com.yaman.email.generator.app;

import lombok.Data;


public class EmailRequest {
    public String getEmailContent() {
        return emailContent;
    }

    public EmailRequest() {

    }

    public EmailRequest(String emailContent, String tone) {
        this.emailContent = emailContent;
        this.tone = tone;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    private String emailContent;

    private String tone;
}
