package com.company.assesment.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.company.assesment.Exception.ResourceNotFoundException;
import com.company.assesment.entity.Employee;
import com.company.assesment.repo.EmployeeRepository;

public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees/{id}")
    public ResponseEntity< Map<Employee, Double> > getEmployeeById(@PathVariable(value = "id") Long employeeId)
    throws ResourceNotFoundException {
        Optional<Employee>  employee = employeeRepository.findById(employeeId);
       Double salary= employee.get().getSalary();
       Map<Employee, Double> map=new LinkedHashMap<Employee, Double>();
        if(salary<250000) {
        map.put( employee.get(), salary) ;
       
        }else if(salary>250000 && salary <=500000) 
        {
        	 map.put( employee.get(), salary-250000*0.05) ;
        	 
        }
        else if(salary>500000 && salary <=1000000) 
        {
        	
        	map.put( employee.get(), 250000*0.05+(salary-500000*0.1)) ;
      	
        }
        else if(salary>1000000)
        {
        	map.put( employee.get(), 250000*0.05+500000*0.1+(salary-1000000*0.2)) ;
        	
        	
        }
        return ResponseEntity.ok().body(map);
        //return ResponseEntity.ok().body(employee);
    }
}
