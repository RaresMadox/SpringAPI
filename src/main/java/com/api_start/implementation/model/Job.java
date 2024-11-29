package com.api_start.implementation.model;

import jakarta.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;


    private int noEmploye = 0;

    public Job() {};

    public Job(String name,String type)
    {
        this.name = name;
        this.type = type;

    }

    public int getNoEmploye(){
        return this.noEmploye;
    }

    public Long getId(){
        return this.id;
    }
    public void addEmploye(){
        this.noEmploye++;
    }

    public void subEmploye()
    {
        this.noEmploye--;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }


}
