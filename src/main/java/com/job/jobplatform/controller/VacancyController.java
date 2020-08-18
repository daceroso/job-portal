package com.job.jobplatform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vacancies")
public class VacancyController {

    @GetMapping("/delete")
    public String deleteVacancy(@RequestParam("id") int idVacancy, Model model){
        System.out.println("Deleting id: " + idVacancy);
        model.addAttribute("id", idVacancy);
        return "message";
    }




    @GetMapping("/view/{id}")
    public String showDetail(@PathVariable("id") int idVacancy, Model model) {
        System.out.println("IdVacancy: " + idVacancy);
        //search detail on db
        model.addAttribute("idVacancy", idVacancy);
        return "vacancies/detail";
    }
}
