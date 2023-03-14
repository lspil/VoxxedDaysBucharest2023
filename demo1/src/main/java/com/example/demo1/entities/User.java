package com.example.demo1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {

  @Id
  private int id;

  private String username;
  private String password;
}
