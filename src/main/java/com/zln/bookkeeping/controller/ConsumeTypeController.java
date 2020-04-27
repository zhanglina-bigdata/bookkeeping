package com.zln.bookkeeping.controller;

import com.zln.bookkeeping.service.ConsumeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeTypeController {
    @Autowired
    private ConsumeTypeService consumeTypeService;
    @RequestMapping("getConsumeType")
    public String GetUser() {
        return consumeTypeService.getConsumeTypeBean().get(1).toString();
    }
}
