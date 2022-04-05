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
@Table(name = "non_technical_skill")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class NonTechnicalSkill {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "spoken", nullable = false)
  @Size(max=20,min=0,message="criteria not met")
  private Long spoken;

  @Column(name = "communication", nullable = false)
  @Size(max=20,min=0,message="criteria not met")
  private Long communication;

  @Column(name = "aptitude", nullable = false)
  @Size(max=20,min=0,message="criteria not met")
  private Long aptitude;
}
*/
