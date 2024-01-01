package net.vamshi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.vamshi.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
