package com.job.jobplatform.model;

import java.util.Date;

public class Vacancy {

    private Integer id;
    private String nameVacancy;
    private String descriptionVacancy;
    private Date datePublished;
    private Double salary;
    private Integer topVacancy;
    private String image="no-image.png";

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

    public Integer getTopVacancy() {
        return topVacancy;
    }

    public void setTopVacancy(Integer topVacancy) {
        this.topVacancy = topVacancy;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
