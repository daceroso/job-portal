package com.job.jobplatform.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/listed")
    public String showListVacant(Model model) {
        List<String> listVacant  = new LinkedList<>();

        listVacant.add("Ingeniero de Sistemas");
        listVacant.add("Auxiliar Contabilidad");
        listVacant.add("Vendedor");
        listVacant.add("Arquitecto");

        model.addAttribute("jobs", listVacant);

        return "listed";
    }


    @GetMapping("/")
    public String showHomePage(Model model) {
//        model.addAttribute("message" ,"Welcome to JobApps" );
//        model.addAttribute("date", new Date());

        String name = "Auxiliar de Contabilidad";
        Date datePublished = new Date();
        double salary = 900.0;
        boolean statusVacant = true;
        model.addAttribute("name", name);
        model.addAttribute("date", datePublished);
        model.addAttribute("salary", salary);
        model.addAttribute("status", statusVacant);
        return "home";
    }
}
