package io.sankha.controller;

import com.github.javafaker.Faker;
import io.sankha.entity.Employee;
import io.sankha.entity.Skill;
import io.sankha.repository.SkillTrackerRepository;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill-tracker/api/v1/engineer")
@RequiredArgsConstructor
public class EmployeesController {

  private final SkillTrackerRepository repository;

  @PostMapping("/add-profile")
  public ResponseEntity<Employee> addProfile(@RequestBody Employee employee)
      throws URISyntaxException {
    Employee savedEmployee = repository.save(employee);
    return ResponseEntity.created(new URI("/add-profile/" + savedEmployee.getId()))
        .body(savedEmployee);
  }

  @PutMapping("/update-profile/{id}")
  public ResponseEntity<Employee> updateProfile(
      @PathVariable Long id, @RequestBody Employee employee) {
    Employee currentEmployee = repository.findById(id).orElseThrow(RuntimeException::new);
    currentEmployee.setName(employee.getName());
    currentEmployee.setEmail(employee.getEmail());
    currentEmployee.setMobile(employee.getMobile());
    currentEmployee.setSkill(employee.getSkill());
    currentEmployee = repository.save(currentEmployee);

    return ResponseEntity.ok(currentEmployee);
  }

  @PostMapping("/add-fake")
  public ResponseEntity<String> addFakeProfile() throws URISyntaxException {
    var faker = new Faker();
    var fakeEmployeeList = new ArrayList<Employee>();
    for (int i = 0; i < 5; i++) {
      var fakeEmployee =
          new Employee()
              .toBuilder()
                  .name(faker.name().name())
                  .email(faker.internet().emailAddress())
                  .mobile(faker.phoneNumber().cellPhone())
                  .skill(
                      new Skill()
                          .toBuilder()
                              .angular(faker.number().numberBetween(1, 20))
                              .aptitude(faker.number().numberBetween(1, 20))
                              .aws(faker.number().numberBetween(1, 20))
                              .communication(faker.number().numberBetween(1, 20))
                              .docker(faker.number().numberBetween(1, 20))
                              .git(faker.number().numberBetween(1, 20))
                              .hibernate(faker.number().numberBetween(1, 20))
                              .htmlCssJavascript(faker.number().numberBetween(1, 20))
                              .jenkins(faker.number().numberBetween(1, 20))
                              .react(faker.number().numberBetween(1, 20))
                              .restful(faker.number().numberBetween(1, 20))
                              .spoken(faker.number().numberBetween(1, 20))
                              .spring(faker.number().numberBetween(1, 20))
                              .build())
                  .build();
      fakeEmployeeList.add(fakeEmployee);
    }
    repository.saveAll(fakeEmployeeList);
    return ResponseEntity.ok("Created");
  }
}
