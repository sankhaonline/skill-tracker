package io.sankha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee1")
// @SecondaryTable(name = "skill", pkJoinColumns = @PrimaryKeyJoinColumn(name = "skill_id"))
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Employee1 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false, nullable = false)
  private Long id;

  @Column(name = "firstName", nullable = false)
  private String firstName;

  @Column(name = "lastName", nullable = false)
  private String lastName;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "mobile", nullable = false)
  private String mobile;

  @Column(name = "htmlCssJavascript", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int htmlCssJavascript;

  @Column(name = "angular", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int angular;

  @Column(name = "react", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int react;

  @Column(name = "spring", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int spring;

  @Column(name = "restful", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int restful;

  @Column(name = "hibernate", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int hibernate;

  @Column(name = "git", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int git;

  @Column(name = "docker", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int docker;

  @Column(name = "jenkins", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int jenkins;

  @Column(name = "aws", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int aws;

  @Column(name = "spoken", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int spoken;

  @Column(name = "communication", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int communication;

  @Column(name = "aptitude", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int aptitude;
}
