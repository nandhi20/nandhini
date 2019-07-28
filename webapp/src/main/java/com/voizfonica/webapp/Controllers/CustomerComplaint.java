package com.voizfonica.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerComplaint {
    @GetMapping("/")
    public String query()
    {
        return "customerComplaint";
    }
}
