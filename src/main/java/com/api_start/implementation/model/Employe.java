package com.api_start.implementation.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employe extends Person{

    @ManyToOne(cascade = CascadeType.ALL)
    private Job job;
    private Long salary;
    private String company;

    public Employe(){};

    public Employe(Person person,Job job,Long salary,String company)
    {
        super(person.getName(), person.getAge());
        this.job = job;
        this.salary = salary;
        this.company = company;
    }

    public Person getPerson()
    {
        return (Person)this;
    }

    public void setPerson(String name,int age)
    {
        super.setAge(age);
        super.setName(name);
    }


    public Job getJob()
    {
        return job;
    }

    public void setJob(String name,String type)
    {
        job.setType(type);
        job.setName(name);
    }

    public long getSalary()
    {
        return salary;
    }

    public void setSalary(Long salary)
    {
        this.salary = salary;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }


}
