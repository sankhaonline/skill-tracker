package io.sankha.repository;

import io.sankha.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillTrackerRepository extends JpaRepository<Employee, Long> {
}
