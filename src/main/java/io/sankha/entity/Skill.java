package io.sankha.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
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
  private int angular;

  @Column(name = "react", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int react;

  @Column(name = "spring", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int spring;

  @Column(name = "restful", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int restful;

  @Column(name = "hibernate", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int hibernate;

  @Column(name = "git", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int git;

  @Column(name = "docker", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int docker;

  @Column(name = "jenkins", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int jenkins;

  @Column(name = "aws", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int aws;

  @Column(name = "spoken", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int spoken;

  @Column(name = "communication", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int communication;

  @Column(name = "aptitude", nullable = false, table = "skill")
  @Size(max = 20, min = 0, message = "criteria not met")
  private int aptitude;
}
