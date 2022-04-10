package io.sankha.repository;

import io.sankha.entity.Employee1;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Path;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

  @PersistenceContext private EntityManager entityManager;

  @Override
  public List<Employee1> findEmployeeByName(String name) {
    var cb = entityManager.getCriteriaBuilder();
    var query = cb.createQuery(Employee1.class);
    var employee = query.from(Employee1.class);

    Path<String> namePath = employee.get("firstName");

    query.select(employee).where(cb.or(cb.like(namePath, name)));

    return entityManager.createQuery(query).getResultList();
  }

  @Override
  public List<Employee1> findEmployeeBySkill(String skillName) {
    var cb = entityManager.getCriteriaBuilder();
    var query = cb.createQuery(Employee1.class);
    var employee = query.from(Employee1.class);

    query.select(employee).where(cb.greaterThan(employee.get(skillName), 10));

    return entityManager.createQuery(query).getResultList();
  }
}
