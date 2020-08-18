package com.job.jobplatform.service;


import com.job.jobplatform.model.Vacancy;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

@Service
public class VacanciesServiceImpl implements IVacanciesService{


    private List<Vacancy> vacancyList = null;
    public VacanciesServiceImpl(){
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

        vacancyList = new LinkedList<Vacancy>();


        try {
            //create vacancy 1
            Vacancy vacancyOne = new Vacancy();
            vacancyOne.setId(1);
            vacancyOne.setNameVacancy("Ingeniero Civil");
            vacancyOne.setDescriptionVacancy("Solicitamos Ing. Civil para diseñar puente peatonal.");
            vacancyOne.setDatePublished(date.parse("08-02-2019"));
            vacancyOne.setSalary(2300.0);
            vacancyOne.setTopVacancy(1);
            vacancyOne.setImage("companyOne.png");

            // create vacancy 2
            Vacancy vacancyTwo = new Vacancy();
            vacancyTwo.setId(2);
            vacancyTwo.setNameVacancy("Contador Publico");
            vacancyTwo.setDescriptionVacancy("Empresa importante solicita contador con 5 años de experiencia titulado.");
            vacancyTwo.setDatePublished(date.parse("09-02-2019"));
            vacancyTwo.setSalary(12000.0);
            vacancyTwo.setTopVacancy(0);
            vacancyTwo.setImage("companyTwo.png");


            //create vacancy 3

            Vacancy vacancyThree = new Vacancy();
            vacancyThree.setId(3);
            vacancyThree.setNameVacancy("Ingeniero Electrico");
            vacancyThree.setDescriptionVacancy("Empresa internacional solicita ingeniero mecanico para mantenimiento de la instalacion electrica");
            vacancyThree.setDatePublished(date.parse("10-02-2019"));
            vacancyThree.setSalary(45000.0);
            vacancyThree.setTopVacancy(0);

            //create vacancy 4

            Vacancy vacancyFour = new Vacancy();
            vacancyFour.setId(4);
            vacancyFour.setNameVacancy("Diseñador Grafico");
            vacancyFour.setDescriptionVacancy("Se solicita Diseñador Grafico para publicidad de la empresa");
            vacancyFour.setDatePublished(date.parse("11-02-2019"));
            vacancyFour.setSalary(6000.0);
            vacancyFour.setTopVacancy(1);
            vacancyFour.setImage("companyFour.png");

            //adding 4 vacancy objects to list

            vacancyList.add(vacancyOne);
            vacancyList.add(vacancyTwo);
            vacancyList.add(vacancyThree);
            vacancyList.add(vacancyFour);


        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


    @Override
    public List<Vacancy> showAllVacancy() {
        return vacancyList;
    }
}
