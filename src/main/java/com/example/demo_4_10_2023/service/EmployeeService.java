package com.example.demo_4_10_2023.service;

import com.example.demo_4_10_2023.entity.Employee;

import java.util.List;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */

public interface EmployeeService {
  List<Employee> getAllEmployee();

  Employee findEmployeeById(Long id);
}
