package com.job.jobplatform.model;

import java.util.Date;

public class Vacancy {

    private Integer id;
    private String nameVacancy;
    private String descriptionVacancy;
    private Date datePublished;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public String getDescriptionVacancy() {
        return descriptionVacancy;
    }

    public void setDescriptionVacancy(String descriptionVacancy) {
        this.descriptionVacancy = descriptionVacancy;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "id=" + id +
                ", nameVacancy='" + nameVacancy + '\'' +
                ", descriptionVacancy='" + descriptionVacancy + '\'' +
                ", datePublished=" + datePublished +
                ", salary=" + salary +
                '}';
    }
}
