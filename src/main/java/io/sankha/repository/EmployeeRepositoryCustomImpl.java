package io.sankha.repository;

import io.sankha.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

  @PersistenceContext private EntityManager entityManager;

  @Override
  public List<Employee> findEmployeeByName(String name) {
    CriteriaBuilder cb = entityManager.getCriteriaBuilder();
    CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
    Root<Employee> employee = query.from(Employee.class);

    Path<String> namePath = employee.get("name");

    query.select(employee).where(cb.or(cb.like(namePath, name)));

    return entityManager.createQuery(query).getResultList();
  }
}
