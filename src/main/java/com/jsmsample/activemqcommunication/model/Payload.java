package com.jsmsample.activemqcommunication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jms.annotation.EnableJms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Payload {

  @Id
  @GeneratedValue
  private String id;

  private String name;

  private Type type;

  private int age;

  public enum Type {
    NEW, EXISTING
  }
}
