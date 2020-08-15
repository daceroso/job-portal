package com.job.jobplatform.Controller;

import com.job.jobplatform.model.Vacancy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/table")
    public String showTableVacancy(Model model){
        List<Vacancy> vacancyList = getVacancy();
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


    // return a list of object type of vacancy

    private List<Vacancy> getVacancy(){
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        List<Vacancy> vacancyList = new LinkedList<>();

        try {
            //create vacancy 1
            Vacancy vacancyOne = new Vacancy();
            vacancyOne.setId(1);
            vacancyOne.setNameVacancy("Ingeniero Civil");
            vacancyOne.setDescriptionVacancy("Solicitamos Ing. Civil para diseñar puente peatonal.");
            vacancyOne.setDatePublished(date.parse("08-02-2019"));
            vacancyOne.setSalary(2300.0);

            // create vacancy 2
            Vacancy vacancyTwo = new Vacancy();
            vacancyTwo.setId(2);
            vacancyTwo.setNameVacancy("Contador Publico");
            vacancyTwo.setDescriptionVacancy("Empresa importante solicita contador con 5 años de experiencia titulado.");
            vacancyTwo.setDatePublished(date.parse("09-02-2019"));
            vacancyTwo.setSalary(12000.0);


            //create vacancy 3

            Vacancy vacancyThree = new Vacancy();
            vacancyThree.setId(3);
            vacancyThree.setNameVacancy("Ingeniero Electrico");
            vacancyThree.setDescriptionVacancy("Empresa internacional solicita ingeniero mecanico para mantenimiento de la instalacion electrica");
            vacancyThree.setDatePublished(date.parse("10-02-2019"));
            vacancyThree.setSalary(45000.0);

            //create vacancy 4

            Vacancy vacancyFour = new Vacancy();
            vacancyFour.setId(4);
            vacancyFour.setNameVacancy("Diseñador Grafico");
            vacancyThree.setDescriptionVacancy("Se solicita Diseñador Grafico para publicidad de la empresa");
            vacancyFour.setDatePublished(date.parse("11-02-2019"));
            vacancyFour.setSalary(6000.0);

            //adding 4 vacancy objects to list

            vacancyList.add(vacancyOne);
            vacancyList.add(vacancyTwo);
            vacancyList.add(vacancyThree);
            vacancyList.add(vacancyFour);


        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return vacancyList;
    }


}
