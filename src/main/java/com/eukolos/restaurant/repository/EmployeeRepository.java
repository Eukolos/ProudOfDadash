package com.eukolos.restaurant.repository;

import com.eukolos.restaurant.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
    Optional<Employee> findByUsername(String username);
}
