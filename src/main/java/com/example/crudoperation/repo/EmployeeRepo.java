package com.example.crudoperation.repo;


import com.example.crudoperation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
