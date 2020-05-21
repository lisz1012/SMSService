package com.lisz.controller;

import com.lisz.model.SMSMetaData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/sms")
public class SMSController {

    @PostMapping("/metadata")
    public SMSMetaData getSMSMetaData(@RequestParam(value = "id") int id, @RequestParam(value = "type") String type) {
        if ("PAYED".equals(type)) {
            return new SMSMetaData(id, "HIGH_PRIORITY", "Hello super user!", new Date());
        } else {
            return new SMSMetaData(id, "Regular", "Hello user!", new Date());
        }
    }
}
