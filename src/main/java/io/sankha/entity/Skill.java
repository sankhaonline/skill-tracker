package io.sankha.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
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

@Embeddable
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

  @Column(name = "html_css_javascript", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int htmlCssJavascript;

  @Column(name = "angular", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long angular;

  @Column(name = "react", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long react;

  @Column(name = "spring", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long spring;

  @Column(name = "restful", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long restful;

  @Column(name = "hibernate", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long hibernate;

  @Column(name = "git", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long git;

  @Column(name = "docker", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long docker;

  @Column(name = "jenkins", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long jenkins;

  @Column(name = "aws", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long aws;

  @Column(name = "spoken", nullable = false, table = "skill")
  @Size(max=20,min=0,message="criteria not met")
  private Long spoken;

  @Column(name = "communication", nullable = false, table = "skill")
  @Size(max=20,min=0,message="criteria not met")
  private Long communication;

  @Column(name = "aptitude", nullable = false, table = "skill")
  @Size(max=20,min=0,message="criteria not met")
  private Long aptitude;
}
