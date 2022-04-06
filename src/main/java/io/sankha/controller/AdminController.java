package io.sankha.controller;

import io.sankha.entity.Employee;
import io.sankha.repository.EmployeeRepositoryCustom;
import io.sankha.repository.SkillTrackerRepository;
import io.sankha.util.ProfileCriteria;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill-tracker/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

  private final SkillTrackerRepository repository;
  private final EmployeeRepositoryCustom customRepository;

  @GetMapping("/{criteria}/{criteriaValue}")
  public ResponseEntity<List<Employee>> getClient(
      @PathVariable ProfileCriteria criteria, @PathVariable String criteriaValue) {
    List<Employee> employeeList = new ArrayList<>();

    switch (criteria) {
      case ID:
        employeeList =
            repository.findById(Long.valueOf(criteriaValue)).stream().collect(Collectors.toList());
        break;
      case NAME:
        employeeList = customRepository.findEmployeeByName(criteriaValue);
        break;
      case SKILL:
        employeeList = customRepository.findEmployeeBySkill(criteriaValue);
        break;
    }
    return ResponseEntity.ok(employeeList);
  }
}
