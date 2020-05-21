package com.lisz.controller;

import com.lisz.model.SMSMetaData;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/sms")
public class SMSController {

    @PostMapping("/metadata")
    public SMSMetaData getSMSMetaData(@RequestBody SMSMetaData smsMetaData) {
        System.out.println("I'm called with ID: " + smsMetaData.getId());
        if ("PAID".equals(smsMetaData.getType())) {
            return new SMSMetaData(smsMetaData.getId(), "HIGH_PRIORITY", "Hello super user!", new Date());
        } else {
            return new SMSMetaData(smsMetaData.getId(), "Regular", "Hello user!", new Date());
        }
    }
}
