package com.bhavana.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhavana.springboot.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
