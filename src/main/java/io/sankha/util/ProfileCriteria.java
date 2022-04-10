package io.sankha.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProfileCriteria {
  NAME("Name"),
  ID("Id"),
  SKILL("Skill");

  private final String criteriaName;
}
