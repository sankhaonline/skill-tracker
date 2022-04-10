package io.sankha.repository;

import io.sankha.entity.Employee1;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryCustom {
  List<Employee1> findEmployeeByName(String name);

  List<Employee1> findEmployeeBySkill(String skillName);
}
