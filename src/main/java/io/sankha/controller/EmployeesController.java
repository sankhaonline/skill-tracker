package io.sankha.controller;

import io.sankha.entity.Employee;
import io.sankha.repository.EmployeeRepository;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/engineer")
public class EmployeesController {

  @Autowired private EmployeeRepository repository;

  @PostMapping("/add-profile")
  public ResponseEntity addProfile(@RequestBody Employee Employee) throws URISyntaxException {
    Employee savedEmployee = repository.save(Employee);
    return ResponseEntity.created(new URI("/add-profile/" + savedEmployee.getId()))
        .body(savedEmployee);
  }

  @PutMapping("/update-profile/{id}")
  public ResponseEntity updateProfile(@PathVariable Long id, @RequestBody Employee employee) {
    Employee currentEmployee = repository.findById(id).orElseThrow(RuntimeException::new);
    currentEmployee.setName(employee.getName());
    currentEmployee.setEmail(employee.getEmail());
    currentEmployee.setMobile(employee.getMobile());
    currentEmployee.setSkill(employee.getSkill());
    currentEmployee = repository.save(employee);

    return ResponseEntity.ok(currentEmployee);
  }
}
