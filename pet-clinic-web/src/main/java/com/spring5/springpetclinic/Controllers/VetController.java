package com.spring5.springpetclinic.Controllers;

import com.spring5.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String getVetList(Model model)
    {
        model.addAttribute("vetList" , vetService.findAll());
        return "vets/index";
    }
}
