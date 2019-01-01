package com.spring5.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Owners")
public class OwnersController {

    @RequestMapping({"/","/index","/index.html"})
    public  String getOwners()
    {
        return  "Owners/index.html";

    }
}
