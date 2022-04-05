package io.sankha.controller;

import io.sankha.entity.Employee;
import io.sankha.repository.EmployeeRepositoryCustom;
import io.sankha.repository.SkillTrackerRepository;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill-tracker/api/v1/admin")
public class AdminController {

  @Autowired private SkillTrackerRepository repository;
  @Autowired private EmployeeRepositoryCustom customRepository;

  @GetMapping("/{id}")
  public ResponseEntity<List<Employee>> getClient(@PathVariable String criteriaName, @PathVariable String criteriaValue) {
    return ResponseEntity.ok(customRepository.findEmployeeByName(criteriaValue));
  }
}
