package io.sankha.controller;

import io.sankha.entity.Employee1;
import io.sankha.repository.EmployeeRepositoryCustom;
import io.sankha.repository.SkillTrackerRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill-tracker/api/v1/admin")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class AdminController {

  private final SkillTrackerRepository repository;
  private final EmployeeRepositoryCustom customRepository;

  @GetMapping("/{criteria}/{criteriaValue}")
  public ResponseEntity<List<Employee1>> getEmployeesByCriteria(
      @PathVariable String criteria, @PathVariable String criteriaValue) {
    List<Employee1> employeeList = new ArrayList<>();

    switch (criteria) {
      case "Id":
        employeeList =
            repository.findById(Long.valueOf(criteriaValue)).stream().collect(Collectors.toList());
        break;
      case "Name":
        employeeList = customRepository.findEmployeeByName(criteriaValue);
        break;
      case "Skill":
        employeeList = customRepository.findEmployeeBySkill(criteriaValue);
        break;
    }
    return ResponseEntity.ok(employeeList);
  }

  @GetMapping()
  public ResponseEntity<List<Employee1>> getEmployees() {
    List<Employee1> employeeList = repository.findAll();
    return ResponseEntity.ok(employeeList);
  }
}
