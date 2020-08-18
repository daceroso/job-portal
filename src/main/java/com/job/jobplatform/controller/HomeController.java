package com.job.jobplatform.controller;

import com.job.jobplatform.model.Vacancy;
import com.job.jobplatform.service.IVacanciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private IVacanciesService serviceVacancies;

    @GetMapping("/table")
    public String showTableVacancy(Model model){
        List<Vacancy> vacancyList = serviceVacancies.showAllVacancy();
        model.addAttribute("vacancies", vacancyList);
        return "table";
    }



    @GetMapping("/detail")
    public String showDetailVacancy(Model model){
        Vacancy vacancy = new Vacancy();
        vacancy.setNameVacancy("Ingeniero de comunicaciones");
        vacancy.setDescriptionVacancy("Se solicita ingeniero para dar soporte a intraner");
        vacancy.setDatePublished(new Date());
        vacancy.setSalary(3000.0);
        model.addAttribute("vacancy", vacancy);
        return "detail";
    }

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
        model.addAttribute("status", true);
        return "home";
    }






}
