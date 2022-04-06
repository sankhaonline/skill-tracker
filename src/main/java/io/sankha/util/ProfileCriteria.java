package io.sankha.util;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ProfileCriteria {
  NAME("Name"),
  ID("Id"),
  SKILL("Skill");

  private final String criteriaName;
}
