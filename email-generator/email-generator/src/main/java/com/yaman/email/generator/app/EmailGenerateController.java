package com.yaman.email.generator.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGenerateController {
    @Autowired
    private final EmailGenerateService emailGenerateService;

    public EmailGenerateController(EmailGenerateService emailGenerateService) {
        this.emailGenerateService = emailGenerateService;
    }

    @PostMapping("generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = this.emailGenerateService.generateEmailReply(emailRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
