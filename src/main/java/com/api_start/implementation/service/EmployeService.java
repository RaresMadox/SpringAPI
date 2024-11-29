package com.api_start.implementation.service;

import com.api_start.implementation.model.Employe;
import com.api_start.implementation.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeService {


    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getAllEmploye(){
        return employeRepository.findAll();
    }

    public Optional<Employe> getEmployeById(Long id)
    {
        return employeRepository.findById(id);
    }

    public Employe saveEmploye(Employe employe)
    {
        return employeRepository.save(employe);
    }

    public void deleteEmploye(Long id)
    {
        employeRepository.deleteById(id);
    }


    public Employe updateEmploy(Long id, Employe employeDetailes)
    {
        Employe employe = employeRepository.findById(id).orElseThrow();
        employe.setJob(employeDetailes.getJob().getName(),employeDetailes.getJob().getName());
        employe.setPerson(employeDetailes.getPerson().getName(),employeDetailes.getPerson().getAge());

        return employeRepository.save(employe);

    }

}
