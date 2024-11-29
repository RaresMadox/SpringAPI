package com.api_start.implementation.controller;

import com.api_start.implementation.model.Employe;
import com.api_start.implementation.model.Person;
import com.api_start.implementation.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employe")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping
    public List<Employe> getAllPersons() {
        return employeService.getAllEmploye();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return employeService.getEmployeById(id).orElseThrow();
    }

    @PostMapping
    public Person createPerson(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Employe employeDetails) {
        return employeService.updateEmploy(id, employeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

}
