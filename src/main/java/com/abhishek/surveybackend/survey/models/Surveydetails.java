package com.abhishek.surveybackend.survey.models;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "surveytable",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "empid"),
                @UniqueConstraint(columnNames = "emailid")
        })


public class Surveydetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 20)
    private String empid;

    @NotBlank
    @Size(max = 60)
    @Email
    private String emailid;

    @NotBlank
    @Size(max = 10)
    private String eventattended;

    @NotBlank
    @Size(max = 50)
    private String location;

    @NotBlank
    @Size(max = 20)
    private String time;


    public Surveydetails() {
    }


    public Surveydetails(String empid, String emailid, String eventattended, String location, String time) {
        this.empid = empid;
        this.emailid = emailid;
        this.eventattended = eventattended;
        this.location = location;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getEventattended() {
        return eventattended;
    }

    public void setEventattended(String eventattended) {
        this.eventattended = eventattended;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}