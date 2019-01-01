package com.spring5.springpetclinic.Controllers;

import com.spring5.springpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Owners")
public class OwnersController {

    private OwnerService ownerService;

    @Autowired
    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","/index","/index.html"})
    public  String getOwners(Model model)
    {
        model.addAttribute("owners",this.ownerService.findAll());
        return  "Owners/index.html";

    }
}
