package io.sankha.repository;

import io.sankha.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillTrackerRepository extends JpaRepository<Employee, Long> {}
