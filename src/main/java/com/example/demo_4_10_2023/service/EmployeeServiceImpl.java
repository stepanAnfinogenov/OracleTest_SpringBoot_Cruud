package com.example.demo_4_10_2023.service;

import com.example.demo_4_10_2023.entity.Employee;
import com.example.demo_4_10_2023.exeption.ResourceNotFoundException;
import com.example.demo_4_10_2023.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;
  @Override
  public List<Employee> getAllEmployee() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee findEmployeeById(Long id) {
    Optional<Employee> employee = Optional.ofNullable(employeeRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Employee with " + id + " not found")));

    return employee.get();
  }
}
