package com.job.jobplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/categories")
public class CategoryController {

    //GetMapping("/index")
    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String showIndex(Model model){
        return "categories/listCategory";
    }


    //GetMapping("/create")
    @RequestMapping(value="/create", method= RequestMethod.GET)
    public String createCategory() {
        return "categories/formCategory";
    }


    //PostMapping("/save")
    @RequestMapping(value="/save", method= RequestMethod.POST)
    public String saveCategory(@RequestParam("name") String name, @RequestParam("description") String description){
        System.out.println("Category: " +name);
        System.out.println("Description: " + description);
        return "categories/listCategory";
    }

}
