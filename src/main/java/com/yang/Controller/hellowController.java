package com.yang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellowController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hellow01(){
        return "hellow Spring boot 2";
    }
}
