package com.carlhuffmeier.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vetController {

    @RequestMapping({"/vets","/vets/index","vets/index.html"})
    public String getVets() {
        return "vets/index";
    }

}
