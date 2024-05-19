package com.carlhuffmeier.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})//this mean in case we enter a url that has as end point, "/ | "" | index..." it will run the index.html that we have in the resources folder
    public String index() {
        return "index";
    }


}
