package com.voizfonica.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomerComplaint {

    @GetMapping("/customerComplaint")
    public String getComplaint(){

        return "customerComplaint";
    }
    @GetMapping("/")
    public String getComplaint1(){

        return "customerComplaint";
    }
}
