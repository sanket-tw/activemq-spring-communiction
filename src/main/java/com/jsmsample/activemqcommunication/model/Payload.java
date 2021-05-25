package com.jsmsample.activemqcommunication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payload {

  private String name;

  private Type type;

  private int age;

  public enum Type {
    NEW, EXISTING
  }
}
