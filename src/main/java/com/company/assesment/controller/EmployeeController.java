package com.company.assesment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.assesment.Exception.ResourceNotFoundException;
import com.company.assesment.entity.Employee;
import com.company.assesment.repo.EmployeeRepository;
import com.company.assesment.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeService  employeeService;

    
    @GetMapping("/employees/{id}")
    public ResponseEntity< Map<Employee, Double> > getEmployeeById(@PathVariable(value = "id") Long employeeId)
    throws ResourceNotFoundException {
        return employeeService.getEmployeeById(employeeId);
           
        //return ResponseEntity.ok().body(employee);
    }

 

    

   

}
