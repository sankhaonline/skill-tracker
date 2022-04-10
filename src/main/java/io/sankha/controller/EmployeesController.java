package io.sankha.controller;

import com.github.javafaker.Faker;
import io.sankha.entity.Employee1;
import io.sankha.repository.SkillTrackerRepository;
import java.net.URISyntaxException;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill-tracker/api/v1/engineer")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class EmployeesController {

  private final SkillTrackerRepository repository;

  /*@PostMapping("/add-profilexx")
  public ResponseEntity<Employee> addProfile(@RequestBody Employee employee)
      throws URISyntaxException {
    Employee savedEmployee = repository.save(employee);
    */
  /*return ResponseEntity.created(new URI("/add-profile/" + savedEmployee.getId()))
  .body(savedEmployee);*/
  /*
    return ResponseEntity.ok(savedEmployee);
  }*/

  @PostMapping("/add-profile")
  public ResponseEntity<Employee1> addProfile(@RequestBody Employee1 employee)
      throws URISyntaxException {
    log.info("Input Employee: {}", employee);
    var savedEmployee = repository.save(employee);
    /*return ResponseEntity.created(new URI("/add-profile/" + savedEmployee.getId()))
    .body(savedEmployee);*/
    return ResponseEntity.ok(savedEmployee);
  }

  @PutMapping("/update-profile/{id}")
  public ResponseEntity<Employee1> updateProfile(
      @PathVariable Long id, @RequestBody Employee1 employee) {
    var currentEmployee = repository.findById(id).orElseThrow(RuntimeException::new);
    currentEmployee.setFirstName(employee.getFirstName());
    currentEmployee.setLastName(employee.getLastName());
    currentEmployee.setEmail(employee.getEmail());
    currentEmployee.setMobile(employee.getMobile());
    currentEmployee.setAngular(employee.getAngular());
    currentEmployee.setAptitude(employee.getAptitude());
    currentEmployee.setAws(employee.getAws());
    currentEmployee.setCommunication(employee.getCommunication());
    currentEmployee.setDocker(employee.getDocker());
    currentEmployee.setHibernate(employee.getHibernate());
    currentEmployee.setJenkins(employee.getJenkins());
    currentEmployee.setGit(employee.getGit());
    currentEmployee.setHtmlCssJavascript(employee.getHtmlCssJavascript());
    currentEmployee.setReact(employee.getReact());
    currentEmployee.setRestful(employee.getRestful());
    currentEmployee.setSpoken(employee.getSpoken());
    currentEmployee.setSpring(employee.getSpring());

    currentEmployee = repository.save(currentEmployee);

    return ResponseEntity.ok(currentEmployee);
  }

  @PostMapping("/add-fake")
  public ResponseEntity<String> addFakeProfile() throws URISyntaxException {
    var faker = new Faker();
    var fakeEmployeeList = new ArrayList<Employee1>();
    for (int i = 0; i < 5; i++) {
      var fakeEmployee =
          new Employee1()
              .toBuilder()
                  .firstName(faker.name().firstName())
                  .lastName(faker.name().lastName())
                  .email(faker.internet().emailAddress())
                  .mobile(faker.phoneNumber().cellPhone())
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
                  .build();
      fakeEmployeeList.add(fakeEmployee);
    }
    repository.saveAll(fakeEmployeeList);
    return ResponseEntity.ok("Created");
  }
}
