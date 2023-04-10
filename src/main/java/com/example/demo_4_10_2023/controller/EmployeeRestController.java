package com.example.demo_4_10_2023.controller;

import com.example.demo_4_10_2023.entity.Employee;
import com.example.demo_4_10_2023.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees")
  public List<Employee> getAllEmployee() {
    return employeeService.getAllEmployee();
  }

  @GetMapping("/employees/{id}")
  public Employee getEmployeeById(@PathVariable Long id) {
    return employeeService.findEmployeeById(id);
  }
}
