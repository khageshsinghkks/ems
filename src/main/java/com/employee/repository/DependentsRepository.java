package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeDependentsEntity;

@Repository
public interface DependentsRepository extends JpaRepository<EmployeeDependentsEntity, Long> {

}
