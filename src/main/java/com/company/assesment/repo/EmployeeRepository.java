package com.company.assesment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.assesment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
