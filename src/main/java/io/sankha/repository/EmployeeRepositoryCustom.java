package io.sankha.repository;

import io.sankha.entity.Employee;
import java.util.List;

public interface EmployeeRepositoryCustom {
    public List<Employee> findEmployeeByName(String name);
}