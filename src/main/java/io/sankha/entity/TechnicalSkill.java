/*
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
@Table(name = "technical_skill")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TechnicalSkill {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "html-css-javascript", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private int htmlCssJavascript;

  @Column(name = "angular", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long angular;

  @Column(name = "react", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long react;

  @Column(name = "spring", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long spring;

  @Column(name = "restful", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long restful;

  @Column(name = "hibernate", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long hibernate;

  @Column(name = "git", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long git;

  @Column(name = "docker", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long docker;

  @Column(name = "jenkins", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long jenkins;

  @Column(name = "aws", nullable = false)
  @Size(max = 20, min = 0, message = "criteria not met")
  private Long aws;
}
*/
