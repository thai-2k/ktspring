package com.example.ictemployee.repository;

import com.example.ictemployee.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface Employees extends CrudRepository<Employee,Integer> {
    Iterable<Employee> findAllEmployees(String name);

}
