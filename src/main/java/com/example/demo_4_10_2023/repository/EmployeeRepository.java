package com.example.demo_4_10_2023.repository;

import com.example.demo_4_10_2023.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
