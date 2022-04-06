package io.sankha.repository;

import io.sankha.entity.Employee;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryCustom {
    List<Employee> findEmployeeByName(String name);

    List<Employee> findEmployeeBySkill(String skillName);
}