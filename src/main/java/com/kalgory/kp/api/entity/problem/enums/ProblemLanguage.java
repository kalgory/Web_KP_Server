package com.kalgory.kp.api.entity.problem.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 문제 사용가능 언어 Enum Class.
 */
@Getter
@AllArgsConstructor
public enum ProblemLanguage {
  C("C", "C"),
  CPP("CPP", "C++"),
  JAVA("JAVA", "Java"),
  CSHARP("CSHARP", "C#"),
  KOTLIN("KOTLIN", "Kotlin"),
  JAVASCRIPT("JAVASCRIPT", "Javascript");

  private final String code;
  private final String value;
}
