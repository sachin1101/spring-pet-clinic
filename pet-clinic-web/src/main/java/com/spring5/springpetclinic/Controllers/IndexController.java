package com.spring5.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
public String indexPage(Model model)
{

    model.addAttribute("welcome", "Welcome to the Pet Clinic");
     return  "index";
 }
}
